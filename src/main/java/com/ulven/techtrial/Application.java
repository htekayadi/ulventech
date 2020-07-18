package com.ulven.techtrial;

import com.ulven.techtrial.util.RandomStringUtil;
import com.ulven.techtrial.validator.InputValidator;

public class Application {

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);

        InputValidator.validate(n);
        RandomStringUtil.generate(n);
    }
}
