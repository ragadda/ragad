package com.userLogin.service;

import com.userLogin.model.Order;
import com.userLogin.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    void createOrder (Order order);
    void deleteOrder(Integer orderId);
    void changeOrderStatus(OrderStatus orderStatus , Integer orderId);

    public List<Order> getOrdersByUserId(Integer id);

}//end class
