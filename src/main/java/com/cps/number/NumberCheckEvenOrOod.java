package com.cps.number;

public class NumberCheckEvenOrOod {
    public static String isOddEven(int number){
       String result = "OOD";
        if(number%2==0){
            result="EVEN";
        }
        return result;
    }
}
