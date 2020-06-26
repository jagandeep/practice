package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionHashCodeTest {
    @Test
    public void equalFractionEqualHashCode(){
        assertEquals(new FractionNumber(5,6).hashCode(),new FractionNumber(5,6).hashCode());
    }

    @Test
    public void unEqualFractionUnEqualHashCode(){
        assertNotEquals(new FractionNumber(5,2).hashCode(),new FractionNumber(5,6).hashCode());
    }
}
