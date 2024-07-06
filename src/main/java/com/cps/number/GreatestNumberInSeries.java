package com.cps.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestNumberInSeries {

    public static int greatestNumber(int[] numberArray){
        Arrays.sort(numberArray);
        return numberArray[numberArray.length-1];
    }
}
