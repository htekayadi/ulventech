package com.ulven.techtrial.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringGeneratorServiceTest {
    StringGeneratorService service = new StringGeneratorService();

    @Test
    public void generate() {
        String data = service.generate(5);
        String[] uniqueStrings = data.split("\n");
        String uniqueString = uniqueStrings[0];

        assertEquals(uniqueStrings.length, 5);
        assertEquals(uniqueString.length(), 100);
        assertTrue(uniqueString.matches("[A-Za-z0-9]+"));
    }
}
