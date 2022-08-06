package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String sex;
    private final Boolean expectedHasMane;

    public LionHasManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] checkHasMane(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkHasManeCorrectValue() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("Value incorrect", expectedHasMane, actualHasMane);
    }

    @Test (expected = Exception.class)
    public void testConstructorException() throws Exception {
        Lion lion = new Lion("Оно");
    }
}
