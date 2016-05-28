package com.androiders.stormy.MyUtils;

/**
 * Created by mgumiero9 on 28/05/16.
 */
public class FahrenheitToCelsius {

/*
* Conversion Formula:
*
* (°F  -  32)  x  5/9 = °C
*
* */

    public FahrenheitToCelsius() {
    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (fahrenheit - 32) * 5/9;

        return celsius;
    }
}

