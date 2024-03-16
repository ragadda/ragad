package com.userLogin.repository.mapper;

import com.userLogin.model.OrderItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemMapper implements RowMapper<OrderItem> {
    @Override
    public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new OrderItem(
                rs.getLong("id"),
                rs.getInt("order_id"),
                rs.getInt("item_id")
        );
    }
}
