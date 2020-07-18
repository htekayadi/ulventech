package com.ulven.techtrial;

import com.ulven.techtrial.service.StringGeneratorService;

public class Application {

    public static void main(String[] args) {
        StringGeneratorService stringGeneratorService = new StringGeneratorService();

        int n = Integer.valueOf(args[0]);
        stringGeneratorService.generate(n);
    }
}
