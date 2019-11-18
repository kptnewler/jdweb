import com.newler.jdweb.DO.OrderInfoDo;
import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.dto.OrderItemDTO;
import com.newler.jdweb.dto.SearchOrderParams;
import com.newler.jdweb.poi.OrderPoi;
import com.newler.jdweb.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderInfoDoPoiTest {
    @Autowired
    public OrderService orderService;

    public OrderPoi orderPoi = new OrderPoi();

    @Test
    public void createExcel() throws IOException {
        SearchOrderParams searchOrder = new SearchOrderParams();
        searchOrder.setPlatform("苏宁");
        searchOrder.setReceiveAddr("%浙江省杭州市%");
        List<OrderItemDTO> orderItems = orderService.getOrderListBySearchParams(searchOrder) ;
        orderPoi.createExcel(orderItems);
    }



}
