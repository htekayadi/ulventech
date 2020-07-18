package com.ulven.techtrial.validator;

import com.ulven.techtrial.exceptions.BadRequestException;

public class InputValidator {
    static final int LOWER_LIMIT = 1;
    static final int UPPER_LIMIT = 239;

    public static void validate(int n) {
        if(n < LOWER_LIMIT || n > UPPER_LIMIT) {
            throw new BadRequestException("Input must be between 1 and 229");
        }
    }
}
