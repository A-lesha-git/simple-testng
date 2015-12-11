package com.example.test;

import org.testng.annotations.Test;

public class ThreeTest {
	 @Test(groups = { "test-one-exclude" })
	    public void testMethodThree() {
	        System.out.println("Test method three");
	    }
}
