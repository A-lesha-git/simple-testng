package com.example.test;

import org.testng.annotations.Test;

public class FourTest {
    @Test(groups = { "test-two-exclude" })
    public void testMethodFour() {
        System.out.println("Test method Four");
    }
}
