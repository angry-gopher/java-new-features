package com.github.angrygopher.javanew.java14;

import java.util.Objects;

public class RecordsPreview1 {
    //    Records cannot extend any other class, and cannot declare instance fields other than the private final fields
    //    which correspond to components of the state description. Any other fields which are declared must be static.
    //possible to override equals and hashcode

    record Pair(int first, int second) {
    }

    record RecordWithMethod<T>(int argument) {
        static String a = "";
        void method() {
            System.out.println(argument);
        }
    }

    record ComparableRecord(int first, int second) implements Comparable<ComparableRecord> {
        @Override
        public int compareTo(ComparableRecord o) {
            return -1;
        }
    }

    record Range (int lo, int hi) {
        public Range {
            if (lo > hi)  /* referring here to the implicit constructor parameters */
                throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
        }
    }

    public static void main(String[] args) {
        var pair1 = new Pair(1, 2);
//        pair1.first = 1;
        var first = pair1.first(); //getter as well pair1.second
        var pair2 = new Pair(1, 2);
        System.out.println(Objects.equals(pair1, pair2));
        System.out.println(pair1.toString());
        System.out.println(pair1.hashCode());

        var recordWithMethod = new RecordWithMethod(1);
        recordWithMethod.method();
    }
}
