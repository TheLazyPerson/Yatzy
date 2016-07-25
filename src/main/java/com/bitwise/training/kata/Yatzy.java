package com.bitwise.training.kata;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by omk on 7/25/2016.
 */
public class Yatzy {


    public void validate(Integer... dice) {
        if (dice.length !=5){
            throw new InvalidDicesException();
        }
        
        for (int diceSide: dice) {
            if (diceSide > 6)
                throw new InvalidDicesException();
        }



    }

    public class InvalidDicesException extends RuntimeException {
    }
}
