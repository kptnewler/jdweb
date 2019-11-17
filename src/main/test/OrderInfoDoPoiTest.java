import com.newler.jdweb.DO.OrderInfoDo;
import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.poi.OrderExcelItem;
import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.dto.SearchOrder;
import com.newler.jdweb.poi.OrderPoi;
import com.newler.jdweb.service.OrderService;
import org.apache.poi.ss.usermodel.*;
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
public class OrderInfoDoPoiTest {
    @Autowired
    public OrderDao orderDao;

    public OrderPoi orderPoi = new OrderPoi();

    @Test
    public void createExcel() throws IOException {
        SearchOrder searchOrder = new SearchOrder();
        searchOrder.setPlatform("苏宁");
        searchOrder.setReceiveAddr("%浙江省杭州市%");
        List<OrderInfoDo> orderInfoDos = orderDao.getOrderListBySearchParams(searchOrder);
        orderPoi.createExcel(orderInfoDos);
    }



}
