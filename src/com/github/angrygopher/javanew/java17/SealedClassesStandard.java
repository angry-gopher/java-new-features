package com.github.angrygopher.javanew.java17;

public class SealedClassesStandard {

    static abstract sealed class Planet permits Earth, Mars {

    }

    static final class Earth extends Planet {

    }

    static final class Mars extends Planet {

    }



}
