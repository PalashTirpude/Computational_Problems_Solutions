package com.cps.number;

public class MutipleOfNumber {

    public static boolean isMultipleOfNumber(int num1, int num2){
        boolean isMultiple=false;
        if(num1%num2==0){
            isMultiple=true;
        }
        return isMultiple;
    }
}
