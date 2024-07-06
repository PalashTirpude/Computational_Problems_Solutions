package com.cps.javaintroduction;

public class ArithmeticOperators {

    public static int sumOfTwoNumbers(int n1, int n2){
        return n1+n2;
    }

    public static int diffrenceOfTwoNumbers(int n1, int n2){
        return n1-n2;
    }

    public static int productOfTwoNumbers(int n1, int n2){
        return (n1*n2);
    }

    public static int quetioentOfTwoNumbers(int n1, int n2){
        return (n1/n2);
    }

    public static int multiplyByTwo(int number){
        int product = number << 1;
        return (product);
    }

    public static int divideByTwo(int number){
        int product = number >> 1;
        return (product);
    }

}
