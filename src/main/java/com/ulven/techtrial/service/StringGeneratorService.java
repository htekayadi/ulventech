package com.ulven.techtrial.service;

import com.ulven.techtrial.util.FileUtil;
import com.ulven.techtrial.util.RandomStringUtil;
import com.ulven.techtrial.validator.InputValidator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

public class StringGeneratorService {

    private String OUTPUT_PREFIX = "Output-";
    private SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");

    public String generate(int n) {
        InputValidator.validate(n);
        Set<String> uniqueStrings = RandomStringUtil.generate(n);
        String data = uniqueStrings.stream().collect(Collectors.joining(System.lineSeparator()));

        FileUtil.write(
                OUTPUT_PREFIX + sdf.format(new Date()),
                data
        );
        return data;
    }
}
