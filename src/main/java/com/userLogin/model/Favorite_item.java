package com.userLogin.model;

import java.util.List;

public class Favorite_item {
    private Integer favListId;
    private Integer itemId;


    public Favorite_item(Integer favListId, Integer itemId) {
        this.favListId = favListId;
        this.itemId = itemId;
    }

    public Integer getFavListId() {
        return favListId;
    }

    public void setFavListId(Integer favListId) {
        this.favListId = favListId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}//end class
