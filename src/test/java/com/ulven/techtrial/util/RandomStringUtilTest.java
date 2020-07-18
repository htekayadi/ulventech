package com.ulven.techtrial.util;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RandomStringUtilTest {
    @Test
    public void getAlphaNumericString() {
        String uniqueString = RandomStringUtil.getAlphaNumericString();

        assertEquals(uniqueString.length(), 100);
        assertTrue(uniqueString.matches("[A-Za-z0-9]+"));
    }

    @Test
    public void generate() {
        Set<String> uniqueStrings = RandomStringUtil.generate(10);

        assertEquals(uniqueStrings.size(), 10);

        String uniqueString = uniqueStrings.iterator().next();

        assertEquals(uniqueString.length(), 100);
        assertTrue(uniqueString.matches("[A-Za-z0-9]+"));
    }
}
