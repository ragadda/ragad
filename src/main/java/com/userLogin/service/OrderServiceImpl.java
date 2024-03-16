package com.userLogin.service;

import com.userLogin.model.Order;
import com.userLogin.model.OrderStatus;
import com.userLogin.repository.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepositoryImpl orderRepository;
    @Override
    public void createOrder(Order order) {
        orderRepository.createOrder(order);
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderRepository.deleteOrder(orderId);
    }

    @Override
    public void changeOrderStatus(OrderStatus orderStatus, Integer orderId) {
        orderRepository.changeOrderStatus(orderStatus,orderId);
    }

    @Override
    public List<Order> getOrdersByUserId(Integer id) {
        return orderRepository.getOrdersByUserId(id);
    }

}//endclass
