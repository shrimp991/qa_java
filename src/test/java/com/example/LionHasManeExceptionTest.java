package com.example;

import org.junit.Test;

public class LionHasManeExceptionTest {
    @Test(expected = Exception.class)
    public void testConstructorException() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Оно", feline);
    }
}
