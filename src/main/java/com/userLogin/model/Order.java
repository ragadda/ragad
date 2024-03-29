package com.userLogin.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Order {
    @JsonProperty("order_id")
    private Integer orderId;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("order_date")
    private LocalDate orderDate;
    @JsonProperty("shipping_address")
    private String shippingAddress;
    @JsonProperty("total_price")
    private double totalPrice;
    private OrderStatus status;

    public Order(Integer orderId, Integer userId, LocalDate orderDate, String shippingAddress, double totalPrice, OrderStatus status) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}//end class
