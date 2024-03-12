package com.userLogin.service;

import com.userLogin.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    void createItem (Item item);
    void deleteItem(Integer itemId);
    void updateItemTitle (Integer itemId,String itemTitle);
    void updateItemImg (Integer itemId,String itemImg);
    void updateItemPrice (Integer itemId,Integer price);
    void updateItemQuantity(Integer itemId,Integer quantity);

    Item getItemByitemId(Integer itemId);
    Item getItemByOrderId(Integer orderId);
    List<Item> getAllItems();

}//end class
