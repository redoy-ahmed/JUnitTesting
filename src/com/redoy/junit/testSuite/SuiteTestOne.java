package com.redoy.junit.testSuite;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuiteTestOne {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
