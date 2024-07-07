package com.cps.number;

public class NumberOfCoins {

    public static String numberOfCoinsRequired(int numberOf1$Coins, int numberOf5$coins, int amount ){
            String result=null;
            int numberOf5$CoinsRequired=(int)(amount/5);
            int numberOf1$CoinsRequired=(int)((amount)-(numberOf5$CoinsRequired*5));
            if(numberOf1$Coins>=numberOf1$CoinsRequired &&  numberOf5$coins>=numberOf5$CoinsRequired){
                result= String.format("Number of 1$ coins required : %s\nNumber Of 5$ coins required : %s"
                        ,numberOf1$CoinsRequired
                        ,numberOf5$CoinsRequired);
            }else{
                result="NP";
            }
            return result;
    }

    public static String findCoinsNeeded(int onesAvailable, int fivesAvailable, int amountNeeded) {
        //set the initial value of return as NP
        String returnValue = "NP";
        // Find out the maximum number of $5 coins that is needed
        int fivesNeeded = amountNeeded / 5;
        // if required number of $5 coins are not available, use the available $coins
        if (fivesNeeded >= fivesAvailable) {
            fivesNeeded = fivesAvailable;
        }
        //Find out the remaining number of $1 coin needed
        int onesNeeded = amountNeeded - (fivesNeeded * 5);
        // if required number of $1 coins are not available , use the available number
        // and construct the return string
        if (onesNeeded <= onesAvailable) {
            returnValue = onesNeeded+" and "+ fivesNeeded;
        }
        return returnValue;
    }
}
