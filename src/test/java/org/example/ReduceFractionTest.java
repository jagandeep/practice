package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void testToReduceFractionWithSameValue() {
        assertEquals( new FractionNumber(1, 1),
                new FractionNumber(2, 2).reduce() );
        assertEquals( new FractionNumber(1, 1),
                new FractionNumber(3, 3).reduce() );
        assertEquals( new FractionNumber(1, 1),
                new FractionNumber(4, 4).reduce());

    }

    @Test
    public void testToReduceFractionWithTwoAsCommonElement() {
        FractionNumber number = new FractionNumber(2,4);
        assertEquals( new FractionNumber(1,2), number.reduce() );

        number = new FractionNumber(20,16);
        assertEquals( new FractionNumber(5,4), number.reduce() );

    }
    @Test
    public void testToReduceFractionWithThreeAsCommonElement() {
        FractionNumber number = new FractionNumber(3,6);
        assertEquals( new FractionNumber(1,2), number.reduce() );
    }
    @Test
    public void testToReduceFractionWithFiveAsCommonElement() {
        FractionNumber number = new FractionNumber(5,10);
        assertEquals( new FractionNumber(1,2), number.reduce() );
    }
    @Test
    public void testToReduceFractionWithSevenAsCommonElement() {
        FractionNumber number = new FractionNumber(7,14);
        assertEquals( new FractionNumber(1,2), number.reduce() );
    }

    @Test
    public void testToReduceFractionWithMultipleCommonElement() {
        FractionNumber number = new FractionNumber(14,28);
        assertEquals( new FractionNumber(1,2), number.reduce() );
    }
    @Test
    public void testToReduceFractionWithMultipleCommonElementAndNumeratorGreaterThanDenominator() {
        FractionNumber number = new FractionNumber(28,14);
        assertEquals( new FractionNumber(2,1), number.reduce() );
    }
    @Test
    public void testToReduceFractionWithCommonElementAndNumeratorGreaterThanDenominator() {
        FractionNumber number = new FractionNumber(10,8);
        assertEquals( new FractionNumber(5,4), number.reduce() );
    }
}
