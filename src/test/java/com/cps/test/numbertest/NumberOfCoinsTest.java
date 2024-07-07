package com.cps.test.numbertest;

import com.cps.number.NumberOfCoins;

import java.util.Scanner;

public class NumberOfCoinsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter $1 coins");
        int numberOf$1Coins=input.nextInt();
        System.out.println("Enter $5 coins");
        int numberOf$5Coins=input.nextInt();
        System.out.println("Enter Amount");
        int amount=input.nextInt();
        System.out.println(NumberOfCoins.numberOfCoinsRequired(numberOf$1Coins,numberOf$5Coins,amount));
    }
}
