package com.userLogin.repository;

import com.userLogin.model.Order;
import com.userLogin.model.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository {

    void createOrder (Order order);
    void deleteOrder(Integer orderId);
    void changeOrderStatus(OrderStatus orderStatus , Integer orderId);
    public List<Order> getOrdersByUserId(Integer id);
}//end class
