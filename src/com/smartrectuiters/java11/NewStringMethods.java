package com.smartrectuiters.java11;

public class NewStringMethods {
    public static void main(String[] args) {
        System.out.println("    ".isBlank());

        "first line\nsecond line".lines().forEach(System.out::println);

        System.out.println("  word  ".strip()); // stripLeading, stripTrailing -- Unicode aware trim

        System.out.println("a".repeat(2)); // Python has for that "abc" * 3
    }
}
