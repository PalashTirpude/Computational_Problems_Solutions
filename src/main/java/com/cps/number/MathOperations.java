package com.cps.number;

public class MathOperations {

    public static int myCeil(double number){
        int ceilValue=0;
        if((number-((int)number))>0){
            ceilValue=(int)number+1;
        }else{
            ceilValue=(int)number;
        }
        return ceilValue;
    }
}
