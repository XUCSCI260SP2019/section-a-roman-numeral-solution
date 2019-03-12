package edu.xavier.csci.dentinger;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class RomanNumeralConverterTest {

    private RomanNumeralConverter sut;

    @Before
    public void setup() {
        sut = new RomanNumeralConverter();
    }

    @Test
    public void decodeI() {

        assertEquals(Integer.valueOf(1), sut.decode("I"));
    }

    @Test
    public void decodei() {

        assertEquals(Integer.valueOf(1), sut.decode("i"));
    }

    @Test
    public void decodeII() {

        assertEquals(Integer.valueOf(2), sut.decode("II"));
    }

    @Test
    public void decodeXI() {

        assertEquals(Integer.valueOf(11), sut.decode("XI"));
    }

    @Test
    public void decodeXXI() {

        assertEquals(Integer.valueOf(21), sut.decode("XXI"));
    }
    @Test
    public void decodeMMXIX() {

        assertEquals(Integer.valueOf(2019), sut.decode("MMXIX"));
    }
    @Test public void decodeCD() {
        assertThat(sut.decode("CD"), is(400));
    }

    @Test
    public void encodeOne() {
        assertThat(sut.encode(1), is("I"));
    }
    @Test
    public void encodeTwo() {
        assertThat(sut.encode(2), is("II"));
    }
    @Test
    public void encodeFive() {
        assertThat(sut.encode(5), is("V"));
    }
    @Test public void encodeTen() {
        assertThat(sut.encode(10), is("X"));
    }
    @Test public void encodeFiveHundred() {
        assertThat(sut.encode(500), is("D"));
    }
    @Test public void encodeOneK() {
        assertThat(sut.encode(1000), is("M"));
    }
    @Test public  void encode1111() {
        assertThat(sut.encode(1111), is("MCXI"));
    }
    @Test public void encode4() {
        assertThat(sut.encode(4), is("IV"));
    }
    @Test public void encode40() {
        assertThat(sut.encode(40), is("XL"));
    }
    @Test public void encode400() {
        assertThat(sut.encode(400), is("CD"));
    }
    @Test public void encode9() {
        assertThat(sut.encode(9), is("IX"));
    }
    @Test public void encode444() {
        assertThat(sut.encode(444), is("CDXLIV"));
    }

    @Test public void encode17651() {
        assertThat(sut.encode(17651), is("MMMMMMMMMMMMMMMMMDCLI"));
    }
}
