package com.newler.jdweb.controller;

import com.newler.jdweb.dto.OrderInfo;
import com.newler.jdweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    public OrderService orderService;

    @GetMapping(path = "order")
    public ModelAndView getOrderList(@RequestParam(name = "uid") String uid) {
        List<OrderInfo> orderInfos = new ArrayList<>();
        if (uid == null || uid.isEmpty()) {
//            orderInfos.addAll(orderService.getOrderList());
        }
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

}
