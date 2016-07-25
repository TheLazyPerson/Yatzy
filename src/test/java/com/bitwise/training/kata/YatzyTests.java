package com.bitwise.training.kata;

import org.junit.Test;

/**
 * Created by omk on 7/25/2016.
 */
public class YatzyTests {

    @Test(expected = Yatzy.InvalidDicesException.class)
    public void itShouldValidateRollingDiceSide_number_of_dice(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        yatzy.validate(1,2,3,4,5,6);
        //then
    }
    @Test(expected = Yatzy.InvalidDicesException.class)
    public void itShouldValidateRollingDiceSide_sideOfDice(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        yatzy.validate(1,2,3,21,5);
        //then
    }
    @Test(expected = Yatzy.InvalidDicesException.class)
    public void itShouldValidateRollingDiceSide_(){
        //given
        Yatzy yatzy = new Yatzy();
        //when
        yatzy.validate(1,2,3,21,5);
        //then
    }
}
