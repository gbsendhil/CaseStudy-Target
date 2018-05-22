package com.target.dealbrowserpoc.dealbrowser.util;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BigDecimalUtilTest {

    @Test
    public void test_decimalValueToFormattedString(){

        BigDecimal testValue = new BigDecimal(1000000.00);

        String result = BigDecimalUtil.getValue(testValue);

        assertEquals("1,000,000.00",result);
    }

    @Test
    public void test_handleNullValueWhenFormattingString(){

        String result = BigDecimalUtil.getValue(null);

        assertEquals("",result);
    }
}