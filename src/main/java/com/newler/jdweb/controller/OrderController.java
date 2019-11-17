package com.newler.jdweb.controller;

import com.newler.jdweb.data.dto.Result;
import com.newler.jdweb.data.dojo.Order;
import com.newler.jdweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    public OrderService orderService;

    @GetMapping(path = "/add")
    public String addOrder() {
        return "orderform";
    }

    @PostMapping(path = "/summit")
    @ResponseBody
    public Result<String> summitOrder(Order order) {
        Result<String> result = new Result<>("提交成功");
        result.setSuccess(true);
        return result;
    }
}
