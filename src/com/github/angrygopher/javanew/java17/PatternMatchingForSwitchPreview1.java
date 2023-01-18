package com.github.angrygopher.javanew.java17;

public class PatternMatchingForSwitchPreview1 {

    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(1L));
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case null -> "it was null";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

}
