package com.romannumeral.roman.model;

import java.util.TreeMap;

public class ArabicToRomanConverter {

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    private final static Integer HIGHEST_NUMBER = 3999;
    private final static Integer LESS_NUMBER = 1;

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    private final static String toRoman(int number) {
        if(number < LESS_NUMBER || number > HIGHEST_NUMBER){

        }
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

    public final static String convertArabic2Roman(int number) {
        if(number < LESS_NUMBER || number > HIGHEST_NUMBER){
            throw new IllegalArgumentException(
                    "Range for converting arabic to roman numbers from 1 to 3999, was requested: " +
                            number);
        }
        return toRoman(number);
    }
}
