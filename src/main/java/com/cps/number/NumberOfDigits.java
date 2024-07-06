package com.cps.number;

public class NumberOfDigits {

    public static int numberOfDigits(int number){
        if(number==0){
            return 1;
        }
        int numberOfDigits=0;
        while(number!=0){
            number=number/10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    public static int numberOfDigitsUsingString(int number){
        if(number==0){
            return 1;
        }
        return String.valueOf(number).length();
    }

    public static int countDigits(int number){
        if (number == 0) {
            return 1; // Special case for zero
        }
        return (int)Math.floor(Math.log10(number) + 1);
    }

    /*

        Math.log10(number):

        This computes the base-10 logarithm of number. The base-10 logarithm of a number x gives the exponent y such that
        10^y=x
        For example, Math.log10(1000) returns 3.0 because
        10^3=1000 + 1:

        Adding 1 adjusts the result to count the total number of digits.
        For example, for number = 1000, Math.log10(1000) gives 3.0. Adding 1 results in 4.0.
        Math.floor():

        This function returns the largest integer less than or equal to the argument.
        It's used here to handle cases where the result might be slightly less than an integer due to floating-point precision issues.
        (int):

        Casting the result to int converts the floating-point number to an integer.

     */

}
