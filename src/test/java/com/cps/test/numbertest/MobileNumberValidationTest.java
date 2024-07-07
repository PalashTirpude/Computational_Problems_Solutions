package com.cps.test.numbertest;

import com.cps.number.ValidateMobileNumber;

import java.util.Scanner;

public class MobileNumberValidationTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        long number=input.nextLong();
        System.out.println(String.format("is entered number valid ?\n%s", ValidateMobileNumber.isMobileNumberValid(number)));
    }
}
