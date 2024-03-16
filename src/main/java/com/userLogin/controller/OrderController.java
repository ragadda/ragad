package com.userLogin.controller;

import com.userLogin.model.Order;
import com.userLogin.model.OrderStatus;
import com.userLogin.service.OrderServiceImpl;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    @PostMapping(value = "/create")
    void createOrder (Order order){
        orderService.createOrder(order);
    }
    @DeleteMapping(value = "/delete")
    void deleteOrder(Integer orderId){
        orderService.deleteOrder(orderId);
    }

    @PutMapping(value = "/change_status")
    void changeStatus (OrderStatus orderStatus, Integer orderId){
        orderService.changeOrderStatus(orderStatus,orderId);
    }

    @GetMapping("/order_by_id")
    List<Order> getOrdersByUserId(Integer id){
        return orderService.getOrdersByUserId(id);
    }

}//end class
