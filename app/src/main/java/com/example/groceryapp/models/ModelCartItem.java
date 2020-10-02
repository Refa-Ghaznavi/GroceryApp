package com.example.groceryapp.models;

public class ModelCartItem {

    String id, pId, name, price, cast, quantity;

    public ModelCartItem() {

    }

    public ModelCartItem(String id, String pId, String name, String price, String cast, String quantity) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.price = price;
        this.cast = cast;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
