package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("tdd")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) didn't know anything about Test Driven Development.";
        }

        if (query.toLowerCase().contains("your name")) {
            return "ValentynaAndHana";
        }

        if (query.toLowerCase().contains("following numbers")) {

            List<Integer> nums = new ArrayList<>();

            String numberOnly= query.replaceAll("[^0-9]", "/");
            String[] num = numberOnly.split("/");
            for (int i = 0; i < num.length; i++) {
                if(!num[i].equals("")) {
                    nums.add(Integer.valueOf(num[i]));
                }

            }

            return String.valueOf(Collections.max(nums));
        }

        if (query.toLowerCase().contains("plus")) {
            Integer sum = 0;
            String numberOnly= query.replaceAll("[^0-9]", "/");
            String[] num = numberOnly.split("/");
            for (int i = 0; i < num.length; i++) {
                if(!num[i].equals(""))
                    sum += Integer.valueOf(num[i]);
            }

            return String.valueOf(sum);
        }

        if (query.toLowerCase().contains("multiplied")) {
            Integer mult = 0;
            List<Integer> nums = new ArrayList<>();
            String numberOnly= query.replaceAll("[^0-9]", "/");
            String[] num = numberOnly.split("/");
            for (int i = 0; i < num.length; i++) {
                if(!num[i].equals(""))
                    nums.add(Integer.valueOf(num[i]));
            }
            mult = nums.get(0) * nums.get(1);

            return String.valueOf(mult);
        }

        return "";
    }
    
}
