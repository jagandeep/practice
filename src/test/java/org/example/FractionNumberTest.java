package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FractionNumberTest
{

    @Test
    public void testGetNumeratorAddTwoFraction(){
        FractionNumber number1 = new FractionNumber(2,4);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5,4), fraction.add(number1,number2) );
    }

    @Test
    public void testAddTwoFractionWithSameDenominator(){
        FractionNumber number1 = new FractionNumber(2,4);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5,4), fraction.add(number1,number2) );
    }
    @Test
    public void testAddTwoFractionWithDifferentDenominator(){
        FractionNumber number1 = new FractionNumber(2,6);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(13,12), fraction.add(number1,number2) );
    }

    @Test
    public void testAddTwoInteger(){
        FractionNumber number1 = new FractionNumber(2);
        FractionNumber number2 = new FractionNumber(3);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5), fraction.add(number1,number2) );
    }

}
