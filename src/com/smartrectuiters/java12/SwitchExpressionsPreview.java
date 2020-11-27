package com.smartrectuiters.java12;

import static java.lang.String.format;

public class SwitchExpressionsPreview {
    public static void main(String[] args) {
        var planet = Planet.SATURN;
        var message = format("All %s moons on %s are beautiful.", numberOfMoons(planet), planet);
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

    static int numberOfMoons(Planet planet) {
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
}



