package com.target.dealbrowserpoc.dealbrowser.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.target.dealbrowserpoc.dealbrowser.BR;
import com.target.dealbrowserpoc.dealbrowser.util.BigDecimalUtil;
import com.target.dealbrowserpoc.dealbrowser.util.Prices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class CartViewModel extends BaseObservable {

    private static final String TAG = "CartViewModel";

    private List<CartItem> cart = new ArrayList<>();
    private boolean isCartVisible;


    @Bindable
    public boolean isCartVisible() {
        return isCartVisible;
    }

    @Bindable
    public List<CartItem> getCart() {
        return cart;
    }

    public void setCartVisible(boolean cartVisible) {
        isCartVisible = cartVisible;
        notifyPropertyChanged(BR.cartVisible);
    }

    public void setCart(List<CartItem> cart) {
        Log.d(TAG, "setCart: updating cart.");
        this.cart = cart;
        notifyPropertyChanged(BR.cart);
    }

    public String getProductQuantitiesString(){
        int totalItems = 0;
        for(CartItem cartItem : cart){
            totalItems += cartItem.getQuantity();
        }

        String s = "";
        if(totalItems > 1){
            s = "items";
        }
        else{
            s = "item";
        }
        return ("( " + String.valueOf(totalItems) + " " + s + "): ");
    }

    public String getTotalCostString(){
        double totalCost = 0;
        for(CartItem cartItem : cart){
            int productQuantity = cartItem.getQuantity();

            double cost = productQuantity * (Prices.getPrices().get(String.valueOf(cartItem.getProduct().getId()))).doubleValue();
            totalCost += cost;
        }

        return "$" + BigDecimalUtil.getValue(new BigDecimal(totalCost));
    }

}



























