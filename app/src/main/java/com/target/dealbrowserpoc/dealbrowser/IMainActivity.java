package com.target.dealbrowserpoc.dealbrowser;


import com.target.dealbrowserpoc.dealbrowser.models.CartItem;
import com.target.dealbrowserpoc.dealbrowser.models.Product;

public interface IMainActivity {

    void inflateViewProductFragment(Product product);

    void showQuantityDialog();

    void setQuantity(int quantity);

    void addToCart(Product product, int quantity);

    void inflateViewCartFragment();

    void setCartVisibility(boolean visibility);

    void updateQuantity(Product product, int quantity);

    void removeCartItem(CartItem cartItem);

}
