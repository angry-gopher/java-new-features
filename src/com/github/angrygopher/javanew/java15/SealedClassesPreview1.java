package com.github.angrygopher.javanew.java15;

public class SealedClassesPreview1 {

    static abstract sealed class Planet permits Earth, Mars {

    }

    static final class Earth extends Planet {

    }

    static final class Mars extends Planet {

    }



}
