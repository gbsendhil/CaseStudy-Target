package com.target.dealbrowserpoc.dealbrowser.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void test_providedQuanity_isConverted_toString_withPrefix() {
        int testQuantity = 10;

        String result = StringUtil.getQuantityString(testQuantity);

        assertEquals("Qty: 10",result);

    }

    @Test
    public void test_providedNegativeQuanityValue_isConverted_toString_withPrefix_quantityAs_0() {
        int testQuantity = -1;

        String result = StringUtil.getQuantityString(testQuantity);

        assertEquals("Qty: 0",result);

    }
    @Test
    public void test_convertIntToString() {

        int testQuantity = 0;

        String result = StringUtil.convertIntToString(testQuantity);

        assertEquals("0",result);

    }
}