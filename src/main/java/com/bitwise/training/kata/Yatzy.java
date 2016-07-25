package com.bitwise.training.kata;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by omk on 7/25/2016.
 */
public class Yatzy {

    int score;

    public void validate(Integer... dice) {
        if (dice.length !=5){
            throw new InvalidDicesException();
        }

        for (int diceSide: dice) {
        if (diceSide > 6 )
            throw new InvalidDicesException();
        }
    }

    public int chance(int... dice) {
        int chanceScore = 0;
        for (int diceSide: dice) {
            chanceScore += diceSide;
        }

        return chanceScore;
    }

    public int yatzy(int... dice) {

        int first = dice[0];
        for(int i = 1; i < dice.length ; i++) {
            if (dice[i] != first) return 0;
        }
        return 50;
    }

    public int ones(int... dice) {
        int onesScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 1){
                onesScore++;
            }
        }
        return onesScore;
    }

    public int twos(int... dice) {
        int twosScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 2){
                twosScore += 2;
            }
        }
        return twosScore;
    }

    public int threes(int... dice) {
        int threesScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 3){
                threesScore += 3;
            }
        }
        return threesScore;
    }

    public int fours(int... dice) {
        int foursScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 4){
                foursScore += 4;
            }
        }
        return foursScore;
    }
    public int fives(int... dice) {
        int fivesScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 5){
                fivesScore += 5;
            }
        }
        return fivesScore;
    }
    public int sixs(int... dice) {
        int fivesScore = 0;
        for (int diceSide: dice) {
            if (diceSide == 6){
                fivesScore += 6;
            }
        }
        return fivesScore;
    }

    public int pair(int... dice) {
        return 0;
    }


    public class InvalidDicesException extends RuntimeException {
    }
}
