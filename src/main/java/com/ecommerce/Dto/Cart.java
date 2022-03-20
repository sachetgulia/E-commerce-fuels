package com.ecommerce.Dto;

import java.util.HashMap;

public class Cart {
    private int cartId;
    private HashMap<Integer,Integer> cartList;//(productId  -  quantity)

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public HashMap<Integer, Integer> getCartList() {
        return cartList;
    }

    public void setCartList(HashMap<Integer, Integer> cartList) {
        this.cartList = cartList;
    }

    public Cart(int cartId, HashMap<Integer, Integer> cartList) {

        this.cartId = cartId;
        this.cartList = cartList;
    }
}
