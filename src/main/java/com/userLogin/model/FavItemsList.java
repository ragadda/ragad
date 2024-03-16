package com.userLogin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class FavItemsList {
    @JsonProperty("Favorite_list_id")
    private Integer favListId;
    @JsonProperty("item_id")
    private Integer itemId;
    @JsonProperty("user_id")
    private Integer userId;

    public FavItemsList(Integer favListId, Integer itemId, Integer userId) {
        this.favListId = favListId;
        this.itemId = itemId;
        this.userId = userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}//end class
