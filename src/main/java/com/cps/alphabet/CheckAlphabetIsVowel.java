package com.cps.alphabet;

public class CheckAlphabetIsVowel{

    public static String checkAlphabetIsVowel(char alphabet){
        if(String.valueOf(alphabet).matches("[aeiou]")){
            System.out.printf("Character %s is Vowel%n",alphabet);
            return String.format("Character %s is Vowel",alphabet);
        }else{
            System.out.printf("Character %s is not Vowel%n",alphabet);
            return String.format("Character %s is not Vowel",alphabet);
        }
    }
}
