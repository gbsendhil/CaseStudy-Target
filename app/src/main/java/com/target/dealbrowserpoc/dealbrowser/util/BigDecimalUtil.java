package com.target.dealbrowserpoc.dealbrowser.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalUtil {

    public static String getValue(BigDecimal value){
        if(null!=value) {
            DecimalFormat df = new DecimalFormat("###,###,###.00");
            return String.valueOf(df.format(value));
        }
        return "";
    }
}
