package com.target.dealbrowserpoc.dealbrowser.util;

public class StringUtil {

    public static String getQuantityString(int quantity) {
        return ("Qty: " + String.valueOf(quantity>0?quantity:0));
    }

    public static String convertIntToString(int value) {
        return (String.valueOf(value));
    }

}









