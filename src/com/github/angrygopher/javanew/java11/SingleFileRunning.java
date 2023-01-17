package com.github.angrygopher.javanew.java11;

class SingleFileRunning {
    //before:
    // javac SingleFileRunning.java
    // java SingleFileRunning

/*  after:
    java SingleFileRunning.java
*/

    public static void main(String[] args) {
        System.out.println("Hello world !");
    }
}
