package com.cps.test.numbertest;

import com.cps.number.MathOperations;

import java.util.Scanner;

public class MatchOperationTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Find Ceil value of fractional number
        System.out.println("Enter the Fractional Number");
        double fractionalNumber=input.nextDouble();
        System.out.println(String.format("Ceil value of entered fractional number is %s", MathOperations.myCeil(fractionalNumber)));
    }
}
