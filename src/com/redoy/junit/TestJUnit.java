
package com.redoy.junit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class TestJUnit {

    int a, b;
    String c;

    @Before
    public void initialization() {
        a = 6;
        b = 5;
        c = null;
    }

    @Test
    public void testEqual() {
        String str = "Setup Successful";
        assertEquals("Setup Successful", str);
    }

    @Test
    public void testCondition() {
        assertTrue("a is greater than b", a > b);
    }

    @Test
    public void testNull() {
        assertNotNull("c is not null", c);
    }
}
