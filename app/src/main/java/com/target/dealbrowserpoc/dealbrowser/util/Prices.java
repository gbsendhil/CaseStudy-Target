package com.target.dealbrowserpoc.dealbrowser.util;

import com.target.dealbrowserpoc.dealbrowser.models.Product;

import java.math.BigDecimal;
import java.util.HashMap;


public class Prices {

    private static final HashMap<String, BigDecimal> PRICES;
    static
    {
        PRICES = new HashMap<String, BigDecimal>();
        Products products = new Products();
        for(Product product : products.PRODUCTS){
            PRICES.put(String.valueOf(product.getId()), product.getSalePrice());
        }
    }



    public static HashMap<String, BigDecimal> getPrices(){
        return  PRICES;
    }
}
