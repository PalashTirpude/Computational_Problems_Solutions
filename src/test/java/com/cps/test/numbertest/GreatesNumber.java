package com.cps.test.numbertest;

import com.cps.number.GreatestNumberInSeries;

import java.util.Arrays;

public class GreatesNumber {

    public static void main(String[] args) {
        String numberSeries="1,2,3,4,5,6,7,8,9,10";

        System.out.println(GreatestNumberInSeries.greatestNumber(convertStringSeriesToArray(numberSeries)));
        System.out.println(GreatestNumberInSeries.greatestNumber(convertStringSeriesToArrayUsingJavaStream(numberSeries)));
    }

    public static int[] convertStringSeriesToArray(String numberSeries){
        int[] numberArray=new int[numberSeries.split(",").length];
        for(int i=0;i<numberSeries.split(",").length;i++){
            numberArray[i]=Integer.parseInt(numberSeries.split(",")[i]);
        }
        return numberArray;
    }

    public static int[] convertStringSeriesToArrayUsingJavaStream(String numberSeries){
        return Arrays.stream(numberSeries.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}
