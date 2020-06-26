package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FractionEqualTest {

    @Test
    public void nonNullReference(){
        assertFalse(new FractionNumber(5,6).equals(null));
    }
    @Test
    public void reflexive(){
        FractionNumber fraction = new FractionNumber(2,3);
      assertEquals(fraction,fraction);
    }
    @Test
    public void symmetric(){
        assertEquals(new FractionNumber(2,3),new FractionNumber(2,3));
    }
    @Test
    public void transitivity(){
        assertEquals(new FractionNumber(2,3),new FractionNumber(2,3));
        assertEquals(new FractionNumber(2,3),new FractionNumber(2,3));
    }
}
