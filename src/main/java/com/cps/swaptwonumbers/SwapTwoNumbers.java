package com.cps.swaptwonumbers;

public class SwapTwoNumbers {
    int num1,num2;

    public  SwapTwoNumbers swapTwoNumbers(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        int temp = num2;
        this.num2=this.num1;
        this.num1=temp;
        System.out.println(String.format("Input Numbers --> num1=%s, num2=%s \nSwapped Numbers --> num1=%s, num2=%s",num1,num2,this.num1,this.num2));
        return this;
    }

    public static void swapTwoNumberWithoutTemp(int num1, int num2){
        System.out.println(String.format("Input Values --> num1=%s, num2=%s",num1, num2));
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println(String.format("Swapped Values --> num1=%s, num2=%s",num1, num2));
    }
    

    /*
        Explanation for bitwise operator

         | Input |o/p|
         -------------
         | A | B | X |
         -------------
         | 0 | 0 | 0 |
         | 0 | 1 | 1 |
         | 1 | 0 | 1 |
         | 1 | 1 | 0 |

         num1 = 10 , bitValue=1010
         num2 = 5  , bitValue=0101

         Step 1:

         num1=num1^num2;  (num1=10,num2=5)

              1010
              0101
              ----
              1111 --> value =15

              Therfore num1=15

         Step 2:

         num2=num1^num2;  (num1=15,num2=5)

              1111
              0101
              ----
              1010 --> value =10

              Therfore num2=10

         Step 3:

         num1=num1^num2;  (num1=15,num2=10)

              1111
              1010
              ----
              0101 --> value =5

              Therfore num1=5

     */
}
