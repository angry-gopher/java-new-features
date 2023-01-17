package com.github.angrygopher.javanew.java14;

import java.util.Objects;

public class TextBlockPreview2 {
    //    New escape sequences
    //    \<line-terminator>
    //    \s (single space)
    public static void main(String[] args) {
        var before = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        var after = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor \
                incididunt ut labore et dolore magna aliqua. \
                Ut enim ad minim veniam, quis nostrud exercitation ullamco \
                laboris nisi ut aliquip ex ea commodo consequat.""";

        System.out.println(Objects.equals(before, after));

        var before1 = """
                red a
                green b
                blue c
                """;
        String after1 = """
                red\sa
                green\sb
                blue\sc
                """;

        System.out.println(Objects.equals(before1, after1));
    }
}
