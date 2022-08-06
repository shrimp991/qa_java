package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void  getFamilyCorrectValue() {
        Feline feline = new Feline();
        String expectedValue = "Кошачьи";
        String actualValue = feline.getFamily();
        assertEquals("Family is incorrect", expectedValue, actualValue);
    }
    @Test
    public void getKittensCorrectValue () {
        Feline feline = new Feline();
        int expectedValue = 1;
        int actualValue = feline.getKittens();
        assertEquals("Kittens value is incorrect", expectedValue, actualValue);
    }

}
