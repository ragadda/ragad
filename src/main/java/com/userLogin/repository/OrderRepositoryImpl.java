package com.userLogin.repository;

import com.userLogin.model.Order;
import com.userLogin.model.OrderStatus;
import com.userLogin.repository.mapper.OrderMapper;
import com.userLogin.service.OrderServiceImpl;
import com.userLogin.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createOrder(Order order) {
        String sql = "INSERT INTO " + Constant.ORDER_TABLE_NAME +  "(user_id, order_date, shipping_address, total_price, status) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,order.getUserId(),order.getOrderDate(),order.getShippingAddress(),order.getTotalPrice(), order.getStatus().toString());
    }

    @Override
    public void deleteOrder(Integer orderId) {
        String sql = "DELETE FROM " + Constant.ORDER_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,orderId);
    }

    @Override
    public void changeOrderStatus(OrderStatus orderStatus , Integer orderId ) {
        String sql = "UPDATE " + Constant.ORDER_TABLE_NAME + " SET status = ? WHERE id = ?";
        jdbcTemplate.update(sql,orderStatus,orderId);
    }

    @Override
    public List<Order> getOrdersByUserId(Integer id) {
        String sql = "SELECT * FROM " + Constant.ORDER_TABLE_NAME + " WHERE user_id = ?";
        return jdbcTemplate.query(sql, new OrderMapper(), id);
    }
}//end class
