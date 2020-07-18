package com.ulven.techtrial.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomStringUtil {

    static int STRING_LENGTH = 100;
    static String OUTPUT_PREFIX = "Output-";

    static SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");

    /**
     * Get alpha numeric string
     *
     * @return string with 100 length of alpha numeric characters
     */
    public static String getAlphaNumericString()
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(STRING_LENGTH);

        for (int i = 0; i < STRING_LENGTH; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    /**
     * Generate n lines consisting of unique alpha numeric characters
     * @param n The line number
     */
    public static void generate(int n) {
        Set<String> uniqueStrings = new HashSet<>();
        String newString;

        for(int i=0; i<n; ) {
            newString = getAlphaNumericString();
            if(!uniqueStrings.contains(newString)) {
                uniqueStrings.add(newString);
                i++;
            }
        }

        FileUtil.write(
                OUTPUT_PREFIX + sdf.format(new Date()),
                uniqueStrings.stream().collect(Collectors.joining(System.lineSeparator()))
        );
    }
}
