package com.userLogin.repository;

import com.userLogin.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Override
    public void createItem(Item item) {

    }

    @Override
    public void deleteItem(Integer itemId) {

    }

    @Override
    public void updateItemTitle(Integer itemId,String itemTitle) {

    }

    @Override
    public void updateItemImg(Integer itemId,String itemImg) {

    }

    @Override
    public void updateItemPrice(Integer itemId,Integer price) {

    }

    @Override
    public void updateItemQuantity(Integer itemId,Integer quantity) {

    }

    @Override
    public Item getItemByitemId(Integer itemId) {
        return null;
    }

    @Override
    public Item getItemByOrderId(Integer orderId) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }
}

