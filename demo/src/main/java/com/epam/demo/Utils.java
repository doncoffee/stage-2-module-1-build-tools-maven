package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = true;

        for (String arg : args) {
            if (!NumberUtils.isCreatable(arg) || NumberUtils.createNumber(arg).doubleValue() <= 0) {
                isAllPositive = false;
                break;
            }
        }
        return isAllPositive;
    }
}