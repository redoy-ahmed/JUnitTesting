package com.redoy.junit.testSuite;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SuiteTestTwo {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
