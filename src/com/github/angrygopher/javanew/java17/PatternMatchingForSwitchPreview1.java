package com.github.angrygopher.javanew.java17;

public class PatternMatchingForSwitchPreview1 {

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case null -> "";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

}
