package com.github.angrygopher.javanew.java15;

public class NewStringMethods {
    public static void main(String[] args) {
        //before
        String.format("Hello %s", "world");

        //after
        "Hello %s".formatted("world");
    }
}
