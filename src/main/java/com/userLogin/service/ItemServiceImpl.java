package com.userLogin.service;

import com.userLogin.model.Item;
import com.userLogin.repository.ItemRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepositoryImpl itemRepository;

    @Override
    public void createItem(Item item) {
        itemRepository.createItem(item);
    }

    @Override
    public void deleteItem(Integer itemId) {
        itemRepository.deleteItem(itemId);
    }

    @Override
    public void updateItemTitle(Integer itemId, String itemTitle) {
        itemRepository.updateItemTitle(itemId,itemTitle);
    }

    @Override
    public void updateItemImg(Integer itemId,String itemImg) {
        itemRepository.updateItemImg(itemId,itemImg);
    }

    @Override
    public void updateItemPrice(Integer itemId,Integer price) {
        itemRepository.updateItemPrice(itemId,price);
    }

    @Override
    public void updateItemQuantity(Integer itemId,Integer quantity) {
        itemRepository.updateItemQuantity(itemId,quantity);
    }

    @Override
    public Item getItemByitemId(Integer itemId) {
        return itemRepository.getItemByitemId(itemId);
    }

    @Override
    public  List<Item> getItemByOrderId(Integer orderId) {
        return itemRepository.getItemByOrderId(orderId);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }
}//end class
