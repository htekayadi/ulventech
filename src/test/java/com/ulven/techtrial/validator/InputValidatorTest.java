package com.ulven.techtrial.validator;

import com.ulven.techtrial.exceptions.BadRequestException;
import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class InputValidatorTest {

    @Test
    public void whenBadRequestExceptionThrown() {
        Exception exception = assertThrows(BadRequestException.class, () -> {
            InputValidator.validate(300);
        });

        String expectedMessage = "Input must be between 1 and 229";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
