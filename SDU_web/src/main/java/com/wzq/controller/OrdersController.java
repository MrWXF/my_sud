package com.wzq.controller;

import com.wzq.service.IOrdersService;
import com.wzq.service.impl.IOrdersServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/orders")
@Controller
public class OrdersController {
    @Autowired
    private IOrdersServiceImpl ordersService;

    //查询订单信息
    @RequestMapping("/findAll")
    public void findAll(@Param("#{id}") String productID) throws Exception {
        ordersService.findAll(productID);

    }
}
