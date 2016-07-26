package com.bitwise.training.kata;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Yatzy {



    private int score;

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
        int pairScore = 0;
        int max_difference = 0;
        int val1 = 0 , val2 = 0;
        Arrays.sort(dice);
        for (int i = 0; i < dice.length - 1; i++) {
            int x = dice[i+1] - dice[i];
            if(x <= max_difference) {
                max_difference = x;
                val1 = dice[i];
                val2 = dice[i+1];

            }
        }
        if (val1 != 0 || val2 != 0)
            pairScore = val1 + val2;

        return pairScore;
    }
    // frequency count pattern taken from http://stackoverflow.com/questions/38585713/finding-two-pairs-from-integer-array-out-of-two-elements/38586797#38586797
    public int twoPair(int... dice) {
        int[] diceFrequency = new int[6];
        for( int d : dice )
             diceFrequency[d-1]++;

        int numberOfPairs = 0;
        int pairSum = 0;

        for( int i = 0; i < diceFrequency.length; i++ ) {
            int num = diceFrequency[i] / 2;
            numberOfPairs += num;
            pairSum += (i + 1 ) * 2 * num;
        }

        if( numberOfPairs >= 2 ) {
            return pairSum;
        }
        return 0;
    }

    public int threeOfAKind(int... dice) {
        int[] diceFrequency = new int[6];
        for( int d : dice )
            diceFrequency[d-1]++;

        for (int i = 0; i < diceFrequency.length; i++) {
            if(diceFrequency[i] >= 3 ){
                return (i+1) * 3;
            }
        }
        return 0;
    }

    public int fourOfAKind(int... dice) {
        int[] diceFrequency = new int[6];
        for( int d : dice )
            diceFrequency[d-1]++;

        for (int i = 0; i < diceFrequency.length; i++) {
            if(diceFrequency[i] >= 4 ){
                return (i+1) * 4;
            }
        }
        return 0;
    }

    public int smallStraight(int... dice) {
        int[] diceFrequency = new int[6];
        for( int d : dice )
            diceFrequency[d-1]++;

        if (diceFrequency[0] == 1 && diceFrequency[1] == 1 && diceFrequency[2] == 1 && diceFrequency[3] == 1 && diceFrequency[4] == 1 )
            return 15;


        return 0;
    }

    public int largeStraight(int... dice) {
        int[] diceFrequency = new int[6];
        for( int d : dice )
            diceFrequency[d-1]++;

        if (diceFrequency[1] == 1 && diceFrequency[2] == 1 && diceFrequency[3] == 1 && diceFrequency[4] == 1 && diceFrequency[5] == 1 )
            return 20;


        return 0;
    }



    public class InvalidDicesException extends RuntimeException {
    }
}
