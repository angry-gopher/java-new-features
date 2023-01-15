package com.github.angrygopher.javanew.java14;


public class PatternMatchingForInstanceOfPreview1 {
    public static void main(String[] args) {
        check("string");
        check(1);
    }

    static void check(Object value) {
        //before
        if (value instanceof String) {
            var strVal = (String) value;
            if (!strVal.isEmpty()) {
                //do some stuff here
            }
        }


        if (value instanceof String str && !str.isEmpty()) {
            System.out.printf("%s is not empty String%n", str);
        }
        if (value instanceof Integer number && number >= 0) {
            System.out.printf("%s is positive integer%n", number);
        }
    }
}
