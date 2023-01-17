package com.github.angrygopher.javanew.java16;

public class SealedClassesPreview2 {

    //possible to remove permits
    sealed interface Planet permits Earth, Mars {

    }

    // this class can be sealed, non-sealed or final only
    final class Earth implements Planet {

    }

    // non-sealed class so it can be extended
    non-sealed class Mars implements Planet {

    }

    class Phobos extends Mars {

    }
}
