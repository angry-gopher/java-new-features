package com.github.angrygopher.javanew.java15;

public class SealedClassesPreview1 {

    static abstract sealed class Planet permits Earth, Mars {

    }

    static non-sealed class Earth extends Planet {

    }

    static final class Moon extends Earth {

    }

    static final class Mars extends Planet {

    }



}
