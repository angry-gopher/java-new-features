package com.github.angrygopher.javanew.java12;

import static java.lang.String.format;

public class SwitchExpressionsPreview {
    public static void main(String[] args) {
        var planet = Planet.SATURN;
        var message = format("All %s moons of %s are beautiful.", numberOfMoonsAfter(planet), planet);
        System.out.println(message);
    }

    public enum Planet {
        MERCURY,
        VENUS,
        EARTH,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE
        //sorry Pluto🪐 but not this time
    }

    static int numberOfMoonsAfter(Planet planet) {
        var number = switch (planet) {
            case MERCURY, VENUS -> 0;
            case EARTH -> 1;
            case MARS -> 5;
            case JUPITER -> 79;
            case SATURN -> 82;
            case URANUS -> 27;
            case NEPTUNE -> 14;
        };
        return number;
    }

    static int numberOfMoons(Planet planet) {
        switch (planet) {
            case MERCURY:
            case VENUS:
            default:
                return 0;
            case EARTH:
                return 1;
            case MARS:
                return 5;
            case JUPITER:
                return 79;
            case SATURN:
                return 82;
            case URANUS:
                return 27;
            case NEPTUNE:
                return 14;
        }
    }
}



