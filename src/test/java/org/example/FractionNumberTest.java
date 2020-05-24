package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class FractionNumberTest
{

    @Test
    public void testToReduceFractionWithSameValue() {
        assertEquals( new FractionNumber(2, 2),
                    FractionNumber.reduce(new FractionNumber(2, 2)) );
        assertEquals( new FractionNumber(3, 3),
                FractionNumber.reduce(new FractionNumber(3, 3)) );
        assertEquals( new FractionNumber(4, 4),
                FractionNumber.reduce(new FractionNumber(4, 4)) );

    }

    @Test
    public void testToReduceFractionWithTwoAsCommonElement() {
        FractionNumber number = new FractionNumber(2,4);
        assertEquals( new FractionNumber(1,2),FractionNumber.reduce(number) );
    }
    @Test
    public void testToReduceFractionWithThreeAsCommonElement() {
        FractionNumber number = new FractionNumber(3,6);
        assertEquals( new FractionNumber(1,2),FractionNumber.reduce(number) );
    }
    @Test
    public void testToReduceFractionWithFiveAsCommonElement() {
        FractionNumber number = new FractionNumber(5,10);
        assertEquals( new FractionNumber(1,2),FractionNumber.reduce(number) );
    }
    @Test
    public void testToReduceFractionWithSevenAsCommonElement() {
        FractionNumber number = new FractionNumber(7,14);
        assertEquals( new FractionNumber(1,2),FractionNumber.reduce(number) );
    }

    @Test
    public void testToReduceFractionWithMultipleCommonElement() {
        FractionNumber number = new FractionNumber(14,28);
        assertEquals( new FractionNumber(1,2),FractionNumber.reduce(number) );
    }
    @Test
    public void testToReduceFractionWithMultipleCommonElementAndNumeratorGreaterThanDenominator() {
        FractionNumber number = new FractionNumber(28,14);
        assertEquals( new FractionNumber(2,1),FractionNumber.reduce(number) );
    }
    @Test
    public void testToReduceFractionWithCommonElementAndNumeratorGreaterThanDenominator() {
        FractionNumber number = new FractionNumber(10,8);
        assertEquals( new FractionNumber(5,4),FractionNumber.reduce(number) );
    }

    @Test
    public void testAddTwoFraction(){
        FractionNumber number1 = new FractionNumber(2,4);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5,4),fraction.add(number1,number2) );
    }

    @Test
    public void testAddTwoFractionWithSameDenominator(){
        FractionNumber number1 = new FractionNumber(2,4);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5,4),fraction.add(number1,number2) );
    }
    @Test
    public void testAddTwoFractionWithDifferentDenominator(){
        FractionNumber number1 = new FractionNumber(2,6);
        FractionNumber number2 = new FractionNumber(3,4);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(13,12),fraction.add(number1,number2) );
    }

    @Test
    public void testAddTwoInteger(){
        FractionNumber number1 = new FractionNumber(2);
        FractionNumber number2 = new FractionNumber(3);
        Fraction fraction = new Fraction();
        assertEquals( new FractionNumber(5),fraction.add(number1,number2) );
    }
}
