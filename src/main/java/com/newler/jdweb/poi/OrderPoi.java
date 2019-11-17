package com.newler.jdweb.poi;

import com.newler.jdweb.DO.OrderInfoDo;
import com.newler.jdweb.dto.SearchOrder;
import org.apache.poi.ss.usermodel.*;
import org.springframework.util.ReflectionUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class OrderPoi {
    private int colNum = 0;
    private Workbook workbook = null;

    public void createExcel(List<OrderInfoDo> orderInfoList) throws IOException {
        String platform = "苏宁";
        try {
            SearchOrder searchOrder = new SearchOrder();
            searchOrder.setPlatform(platform);
            searchOrder.setReceiveAddr("%浙江省杭州市%");
            List<OrderExcelItem> orderInfoExcels = orderInfoList.stream().map(this::convert).collect(Collectors.toList());
//            File file = new File("E:\\京东手机报单.xlsx");
            File file = new File("E:\\"+platform+"手机报单.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            workbook = WorkbookFactory.create(true);
            Sheet sheet = workbook.createSheet();

            Row headerRow = sheet.createRow(0);
            ReflectionUtils.doWithFields(OrderExcelItem.class, field -> {
                field.setAccessible(true);
                Cell cell = headerRow.createCell(colNum);
                cell.setCellValue(field.getName());
                cell.setCellStyle(createHeadStyle(workbook));
                colNum++;
            });

            for (int rowNum = 0; rowNum < orderInfoExcels.size(); rowNum++) {
                Row row = sheet.createRow(rowNum+1);
                colNum = 0;
                OrderExcelItem orderInfoExcel = orderInfoExcels.get(rowNum);
                ReflectionUtils.doWithFields(OrderExcelItem.class, field -> {
                    field.setAccessible(true);
                    Cell cell = row.createCell(colNum);
                    CellStyle cellContentStyle = createContentStyle(workbook);
                    if (field.getName().equals("registration")) {
                        if (((boolean)field.get(orderInfoExcel))) {
                            cell.setCellValue("是");
                        } else {
                            cell.setCellValue("否");
                            cellContentStyle.setFillForegroundColor(IndexedColors.RED.index);
                            cellContentStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        }
                    } else {
                        cell.setCellValue(String.valueOf(field.get(orderInfoExcel)));
                    }
                    cell.setCellStyle(cellContentStyle);
                    sheet.autoSizeColumn(colNum);
                    colNum++;
                });
            }
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }


    private CellStyle createHeadStyle(Workbook workbook) {
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setWrapText(true);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 16);
        cellStyle.setFont(font);
        return cellStyle;
    }

    private CellStyle createContentStyle(Workbook workbook) {
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setWrapText(true);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return cellStyle;
    }

    private OrderExcelItem convert(OrderInfoDo order) {
        OrderExcelItem orderInfoExcel = new OrderExcelItem();
        orderInfoExcel.setCarriageId(order.getCarriageId());
        orderInfoExcel.setId(order.getId());
        orderInfoExcel.setPayWay(order.getPayWay());
        orderInfoExcel.setPrice(order.getPrice());
        orderInfoExcel.setRegistration(order.getRegistration());
        orderInfoExcel.setStatus(order.getStatus());
        orderInfoExcel.setSettlementPrice(order.getSettlementPrice());
        orderInfoExcel.setUid(order.getUid());
        orderInfoExcel.setPlatform(order.getPlatform());
        String receiverIverInfo = new StringBuilder("收件人:").append(order.getReceiverName()).append("\n")
                .append("收件号码").append(order.getReceiverPhone()).append("\n")
                .append("收件地址").append(order.getReceiverAddress()).append("\n").toString();

        orderInfoExcel.setReceiverInfo(receiverIverInfo);
        StringBuilder goodsInfoStringBuilder = new StringBuilder("");
        AtomicInteger goodsNum = new AtomicInteger();
        order.getGoodsInfos().forEach(goodsInfo -> {
            goodsInfoStringBuilder.append(goodsInfo.getName()).append("\n");
            goodsNum.addAndGet(goodsInfo.getNum());
        });
        orderInfoExcel.setGoodsInfo(goodsInfoStringBuilder.toString());
        orderInfoExcel.setGoodsNum(goodsNum.get());

        return orderInfoExcel;
    }
}
