package com.userLogin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItem {
    private Long id;
    @JsonProperty("order_id")
    private Integer orderId;
    @JsonProperty("item_id")
    private Integer itemId;

    public OrderItem(long id, Integer itemId, Integer orderId) {
        this.itemId = itemId;
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}//end class