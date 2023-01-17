package com.github.angrygopher.javanew.java19;

public class RecordPatternsPreview1 {

    record Point(int x, int y) {
    }

    static void printSum(Object o) {
        if (o instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }
    }

    public static void main(String[] args) {
       printSum(new Point(1,2));
    }

}
