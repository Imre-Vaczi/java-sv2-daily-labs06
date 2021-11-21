package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers = new PerfectNumbers();

    @Test
    void testWithValidNumber(){
        boolean toTest = perfectNumbers.isPerfectNumber(8128);
        assertEquals(true, toTest);
    }

    @Test
    void testWithInValidNumber(){
        boolean toTest = perfectNumbers.isPerfectNumber(9);
        assertEquals(false, toTest);
    }

}