package org.example.config.security;

import java.security.SecureRandom;

public class RandomNumber {

    private static final SecureRandom randomicNumber = new SecureRandom();

    private  RandomNumber(){}

    public static int getNumber(){
        return convertedSecureRandomToInt();
    }

    private static int convertedSecureRandomToInt(){
        return randomicNumber.nextInt(10000);
    }

}
