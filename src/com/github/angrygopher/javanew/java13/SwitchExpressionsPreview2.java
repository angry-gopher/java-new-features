package com.github.angrygopher.javanew.java13;

import com.github.angrygopher.javanew.java12.SwitchExpressionsPreview1.Planet;

import static com.github.angrygopher.javanew.java12.SwitchExpressionsPreview1.Planet.JUPITER;

public class SwitchExpressionsPreview2 {
    private static final double MILE_TO_KM_RATIO = 1.609;

    public static void main(String[] args) {
       var diameter = calculateDiameter(JUPITER);
    }

    static double calculateDiameter(Planet planet) {
        var diameter = switch (planet) {
            case MERCURY -> {
                var kms = convertToKms(1_515.5);
                yield 2 * kms;
            }
            case VENUS -> {
                var kms = convertToKms(3_760.5);
                yield 2 * kms;
            }
            case EARTH -> {
                var kms = convertToKms(3_963);
                yield 2 * kms;
            }
            case MARS -> {
                var kms = convertToKms(2_111);
                yield 2 * kms;
            }
            case JUPITER -> {
                var kms = convertToKms(44_364.5);
                yield 2 * kms;
            }
            case SATURN -> {
                var kms = convertToKms(37_300);
                yield 2 * kms;
            }
            case URANUS -> {
                var kms = convertToKms(16_300);
                yield 2 * kms;
            }
            case NEPTUNE -> {
                var kms = convertToKms(15_100);
                yield 2 * kms;
            }
        };

        System.out.printf("%s diameter is %s km%n", planet, diameter);

        return diameter;
    }

    static double convertToKms(double miles) {
        return MILE_TO_KM_RATIO * miles;
    }
}
