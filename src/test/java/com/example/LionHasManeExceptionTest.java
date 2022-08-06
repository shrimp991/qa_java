package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionHasManeExceptionTest {
    @Test(expected = Exception.class)
    public void testConstructorException() throws Exception {
        try {
            Lion lion = new Lion("Оно");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            throw e;
        }
    }
}
