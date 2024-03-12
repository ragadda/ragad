package com.userLogin.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class FavItemsList {
    private Integer favListId;
    private List<Item> favList;
    private Integer userId;


    public FavItemsList(Integer favListId, List<Item> favList, Integer userId) {
        this.favListId = favListId;
        this.favList = favList;
        this.userId = userId;
    }

    public Integer getFavListId() {
        return favListId;
    }

    public void setFavListId(Integer favListId) {
        this.favListId = favListId;
    }

    public List<Item> getFavList() {
        return favList;
    }

    public void setFavList(List<Item> favList) {
        this.favList = favList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}//end class
