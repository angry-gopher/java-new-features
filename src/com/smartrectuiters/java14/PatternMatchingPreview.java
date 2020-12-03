package com.smartrectuiters.java14;


public class PatternMatchingPreview {
    public static void main(String[] args) {
        check("string");
        check(1);
    }

    static void check(Object value) {
        //before
        if (value instanceof String) {
            var strVal = (String) value;
        }


        if (value instanceof String str && !str.isEmpty()) {
            System.out.printf("%s is not empty String%n", str);
        }
        if (value instanceof Integer number && number >= 0) {
            System.out.printf("%s is positive integer%n", number);
        }
    }
}
