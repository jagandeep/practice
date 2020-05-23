package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FractionTest
{
    private Fraction fraction = new Fraction();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdditionOfTwoIntegerOfZeroValue() {
        assertEquals( 0, fraction.add(0,0) );
    }

    @Test

    public void testAdditionOfTwoIntegerOfZeroValueAndNonZero() {
        assertEquals( 1,fraction.add(1,0) );
    }

    @Test
    public void testAdditionOfTwoIntegerOfNonZeroAndZeroValue() {
        assertEquals( 2,fraction.add(0,2) );
    }

    @Test
    public void testAdditionOfTwoIntegerOfNonZeroValue() {
        assertEquals( 5,fraction.add(3,2) );
    }

}
