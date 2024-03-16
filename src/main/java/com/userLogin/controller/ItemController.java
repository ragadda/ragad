package com.userLogin.controller;

import com.userLogin.model.Item;
import com.userLogin.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(value ="/creat")
    void createPoll(@RequestBody Item item){
        itemService.createItem(item);
    }

    @DeleteMapping(value ="/delete")
    void deletePoll(@RequestParam(value = "item_id") Integer itemId){
        itemService.deleteItem(itemId);
    }

    @PutMapping(value = "/ update_title")
    public void updateItemTitle(@RequestParam(value = "item_id") Integer itemId,@RequestParam String title){
        itemService.updateItemTitle(itemId,title);
    }
    @PutMapping(value = "/update_img")
    public void updateItemImg(@RequestParam(value = "item_id") Integer itemId,@RequestParam String img){
        itemService.updateItemImg(itemId,img);
    }
    @PutMapping(value = "/update_price")
    public void updateItemPrice(@RequestParam(value = "item_id") Integer itemId,@RequestParam Integer price){
        itemService.updateItemPrice(itemId,price);
    }

    @PutMapping(value = "/update_quantity")
    public void updateItemQuantity(@RequestParam(value = "item_id") Integer itemId,@RequestParam Integer quantity){
        itemService.updateItemQuantity(itemId,quantity);
    }

    @GetMapping(value = "/get_item_by_id")
    public Item getItemById(Integer itemId){
        return itemService.getItemByitemId(itemId);
    }
    @GetMapping(value = "/get_all")
    public List<Item> getItemById(){
        return itemService.getAllItems();
    }
    @GetMapping(value = "/get_item_by_order_id")
    List<Item> getItemByOrderId(Integer orderId){
        return itemService.getItemByOrderId(orderId);
    }

}//end class
