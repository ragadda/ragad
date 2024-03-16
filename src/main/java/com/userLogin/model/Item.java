package com.userLogin.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("item_id")
    private Integer itemId;
    private String title;
    private String img;
    private double price;
    private int quantity;

    public Item(Integer itemId, String title, String img, double price, int quantity) {
        this.itemId = itemId;
        this.title = title;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}//end class
