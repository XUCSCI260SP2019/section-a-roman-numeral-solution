package edu.xavier.csci.dentinger;

import org.junit.Test;
import static org.junit.Assert.*;
public class RomanNumeralConverterTest {

    @Test
    public void decodeI() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(1), r.decode("I"));
    }

    @Test
    public void decodei() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(1), r.decode("i"));
    }

    @Test
    public void decodeII() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(2), r.decode("II"));
    }

    @Test
    public void decodeXI() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(11), r.decode("XI"));
    }

    @Test
    public void decodeXXI() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(21), r.decode("XXI"));
    }
    @Test
    public void decodeMMXIX() {
        RomanNumeralConverter r = new RomanNumeralConverter();
        assertEquals(Integer.valueOf(2019), r.decode("MMXIX"));
    }

}
