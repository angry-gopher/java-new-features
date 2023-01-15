package com.github.angrygopher.javanew.java16;

public class SealedClassesPreview2 {

    static abstract sealed class Planet permits Earth, Mars {

    }

    static final class Earth extends Planet {

    }

    static final class Mars extends Planet {

    }



}
