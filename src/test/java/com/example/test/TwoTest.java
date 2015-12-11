package com.example.test;

import org.testng.annotations.Test;

public class TwoTest {
    @Test(groups = { "include-test-one" })
    public void testMethodTwo() {
        System.out.println("Test method two");
    }
}
