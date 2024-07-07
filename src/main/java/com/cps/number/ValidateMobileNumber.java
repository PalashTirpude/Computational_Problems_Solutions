package com.cps.number;

public class ValidateMobileNumber {

    public static boolean isMobileNumberValid(long number){
        boolean checkNumberIsValid=false;
        if(String.valueOf(number).matches("^[0-9]{10}$")){
            checkNumberIsValid=true;
        }
        return checkNumberIsValid;
    }

}
