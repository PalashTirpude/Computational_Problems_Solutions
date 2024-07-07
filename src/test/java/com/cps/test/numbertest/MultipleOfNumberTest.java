package com.cps.test.numbertest;

import com.cps.number.MutipleOfNumber;

import java.util.Scanner;

public class MultipleOfNumberTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number.");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println(String.format("%s is multiple of %s ?\n%s",num1,num2,MutipleOfNumber.isMultipleOfNumber(num1,num2)));
    }
}
