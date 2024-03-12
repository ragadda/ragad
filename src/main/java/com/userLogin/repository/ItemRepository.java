package com.userLogin.repository;

import com.userLogin.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository {
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
