
package com.redoy.junit.singleTest;

import org.junit.*;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class TestJUnit {

    int a, b;
    String c;

    /**
     * This method is executed once
     */
    @BeforeClass
    public static void setup() {
        System.out.println("Using @BeforeClass , executed before all test cases ");
    }

    /**
     * This method is executed before each test cases
     */
    @Before
    public void initialization() {
        a = 6;
        b = 5;
        c = null;

        System.out.println("Using @Before annotations ,executed before each test cases ");
    }

    /**
     * This method is a test case for assertEquals
     */
    @Test
    public void testEqual() {
        String str = "Setup Successful";
        assertEquals("Setup Successful", str);
    }

    /**
     * This method is a test case for assertNotEquals
     */
    @Test
    public void testNotEqual() {
        String str = "Setup Successful  ";
        assertNotEquals("Setup Successful", str);
    }

    /**
     * This method is a test case for assertTrue
     */
    @Test
    public void testConditionTrue() {
        assertTrue("a is greater than b", a > b);
    }

    /**
     * This method is a test case for assertTrue
     */
    @Test
    public void testConditionFalse() {
        assertFalse("a is greater than b", a > b);
    }

    /**
     * This method is a test case for assertNull
     */
    @Test
    public void testNull() {
        assertNull("c is not null", c);
    }

    /**
     * This method is a test case for assertNotNull
     */
    @Test
    public void testNotNull() {
        assertNotNull("c is not null", c);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Using @AfterClass ,executed after all test cases");
    }

    @After
    public void destruction() {
        System.out.println("Using @After ,executed after each test cases");
    }

    @Ignore
    public void ignoreMethod() {
        System.out.println("Using @Ignore , this execution is ignored");
    }

    @Test(timeout = 10)
    public void timeOut() {
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
    }

    @Test(expected = NoSuchMethodException.class)
    public void exception() {
        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");
    }
}
