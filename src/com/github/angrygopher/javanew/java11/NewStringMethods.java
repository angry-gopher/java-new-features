package com.github.angrygopher.javanew.java11;

public class NewStringMethods {
    public static void main(String[] args) {
        "    ".isBlank();

        "first line\nsecond line".lines().forEach(System.out::println);

        "  word  ".strip(); // stripLeading, stripTrailing -- Unicode aware trim

        "a".repeat(2); // Python has for that "abc" * 3

    }
}
