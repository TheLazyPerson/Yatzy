package com.bitwise.training.kata;

import org.junit.Assert;
import org.junit.Test;


public class YatzyTests {

    @Test(expected = Yatzy.InvalidDicesException.class)
    public void itShouldValidateRollingDiceSide_numberOfDice(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        yatzy.validate(1,2,3,4,5,6);
        //then
    }
    @Test(expected = Yatzy.InvalidDicesException.class)
    public void itShouldValidateRollingDiceSide_checkValidDice(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        yatzy.validate(1,2,3,21,5);
        //then
    }

    @Test
    public void itShouldPerformChanceRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.chance(1,1,3,3,6);
        int expected = 14;
        int actual2 = yatzy.chance(4,5,5,6,1);
        int expected2 = 21;

        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void itShouldPerformYatzyRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.yatzy(1,1,1,1,1);
        int expected = 50;
        int actual2 = yatzy.yatzy(1,1,1,2,1);
        int expected2 = 0;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformOnesRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.ones(1,1,1,1,1);
        int expected = 5;
        int actual2 = yatzy.ones(1,2,2,3,1);
        int expected2 = 2;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformTwosRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.twos(2,2,1,1,1);
        int expected = 4;
        int actual2 = yatzy.twos(1,2,2,3,1);
        int expected2 = 4;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformThreesRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.threes(2,3,1,3,1);
        int expected = 6;
        int actual2 = yatzy.threes(1,2,3,3,1);
        int expected2 = 6;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformFoursRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.fours(4,4,1,1,1);
        int expected = 8;
        int actual2 = yatzy.fours(3,3,3,3,1);
        int expected2 = 0;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformFivesRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.fives(2,5,5,5,1);
        int expected = 15;
        int actual2 = yatzy.fives(1,2,3,3,1);
        int expected2 = 0;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void itShouldPerformSixsRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.sixs(6,6,6,6,1);
        int expected = 24;
        int actual2 = yatzy.sixs(1,2,3,3,1);
        int expected2 = 0;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void itShouldPerformPairRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.pair(3,3,3,4,4);
        int expected = 8;
        int actual2 = yatzy.pair(1,1,6,2,6);
        int expected2 = 12;
        int actual3 = yatzy.pair(3,3,3,4,1);
        int expected3 = 6;
        int actual4 = yatzy.pair(3,3,3,3,1);
        int expected4 = 6;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void itShouldPerformTwoPairRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.twoPair(1,1,2,3,3);
        int expected = 8;
        int actual2 = yatzy.twoPair(1,1,2,3,4);
        int expected2 = 0;
        int actual3 = yatzy.twoPair(1,1,2,2,2);
        int expected3 = 6;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void itShouldPerformThreeOfAKindRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.threeOfAKind(3,3,3,4,5);
        int expected = 9;
        int actual2 = yatzy.threeOfAKind(3,3,4,5,6);
        int expected2 = 0;
        int actual3 = yatzy.threeOfAKind(3,3,3,3,1);
        int expected3 = 9;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void itShouldPerformFourOfAKindRule(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        int actual = yatzy.fourOfAKind(2,2,2,2,5);
        int expected = 8;
        int actual2 = yatzy.fourOfAKind(2,2,2,5,5);
        int expected2 = 0;
        int actual3 = yatzy.fourOfAKind(2,2,2,2,2);
        int expected3 = 8;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

}
