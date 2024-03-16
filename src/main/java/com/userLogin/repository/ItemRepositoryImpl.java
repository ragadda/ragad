package com.userLogin.repository;

import com.userLogin.model.Item;
import com.userLogin.model.Order;
import com.userLogin.repository.mapper.ItemMapper;
import com.userLogin.repository.mapper.OrderMapper;
import com.userLogin.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createItem(Item item) {
        String sql = "INSERT INTO " + Constant.ITEM_TABLE_NAME + " (title,img,price,quantity) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, item.getTitle(), item.getImg(), item.getPrice(), item.getQuantity());
    }

    @Override
    public void deleteItem(Integer itemId) {
        String sql = "DELETE FROM " + Constant.ITEM_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,itemId);
    }

    @Override
    public void updateItemTitle(Integer itemId,String itemTitle) {
        String sql = "UPDATE " + Constant.ITEM_TABLE_NAME + " SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,itemTitle,itemId);
    }

    @Override
    public void updateItemImg(Integer itemId,String itemImg) {
        String sql = "UPDATE " + Constant.ITEM_TABLE_NAME + " SET img = ? WHERE id = ?";
        jdbcTemplate.update(sql,itemImg,itemId);
    }

    @Override
    public void updateItemPrice(Integer itemId,Integer price) {
        String sql = "UPDATE " + Constant.ITEM_TABLE_NAME + " SET price = ? WHERE id = ?";
        jdbcTemplate.update(sql,price,itemId);
    }

    @Override
    public void updateItemQuantity(Integer itemId,Integer quantity) {
        String sql = "UPDATE " + Constant.ITEM_TABLE_NAME + " SET quantity = ? WHERE id = ?";
        jdbcTemplate.update(sql,quantity,itemId);
    }

    @Override
    public Item getItemByitemId(Integer itemId) {
        String sql = "SELECT * FROM " + Constant.ITEM_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new ItemMapper(),itemId);
    }

    @Override
    public  List<Item> getItemByOrderId(Integer orderId) {
        String sql = "SELECT * FROM " + Constant.ITEM_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.query(sql,new ItemMapper(),orderId);
    }


    @Override
    public List<Item> getAllItems() {
        String sql = "SELECT * FROM " + Constant.ITEM_TABLE_NAME;
        return jdbcTemplate.query(sql,new ItemMapper());
    }
}

