import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.dto.OrderInfo;
import com.newler.jdweb.service.OrderService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ReflectionUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderPoiTest {
    @Autowired
    public OrderService orderService;
    private int colNum = 0;
    private Workbook workbook = null;

    @Test
    public void createExcel() throws IOException {
        System.out.println(orderService.getOrderList());
        try {
            List<OrderInfo> orderInfos = orderService.getOrderList();
            File file = new File("F:\\手机报单.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            workbook = WorkbookFactory.create(true);
            Sheet sheet = workbook.createSheet();

            Row headerRow = sheet.createRow(0);
            ReflectionUtils.doWithFields(OrderInfo.class, field -> {
                field.setAccessible(true);
                Cell cell = headerRow.createCell(colNum);
                cell.setCellValue(field.getName());
                cell.setCellStyle(createHeadStyle(workbook));
                colNum++;
            });

            for (int rowNum = 0; rowNum < orderInfos.size(); rowNum++) {
                Row row = sheet.createRow(rowNum+1);
                colNum = 0;
                OrderInfo orderInfo = orderInfos.get(rowNum);
                ReflectionUtils.doWithFields(OrderInfo.class, field -> {
                    field.setAccessible(true);
                    Cell cell = row.createCell(colNum);
                    CellStyle cellContentStyle = createContentStyle(workbook);
                    if (field.getName().equals("registration")) {
                        if (((boolean)field.get(orderInfo))) {
                            cell.setCellValue("是");
                        } else {
                            cell.setCellValue("否");
                            cellContentStyle.setFillForegroundColor(IndexedColors.RED.index);
                            cellContentStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        }
                    } else {
                        cell.setCellValue(String.valueOf(field.get(orderInfo)));
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


    public CellStyle createHeadStyle(Workbook workbook) {
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

    public CellStyle createContentStyle(Workbook workbook) {
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setWrapText(true);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return cellStyle;
    }
}
