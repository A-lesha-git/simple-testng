package com.example.test;

import org.testng.annotations.Test;
import com.example.util.PropertyLoader;
public class OneTest {
	 @Test(groups = { "include-test-one" })
	    public void testMethodOne() {
	        System.out.println("Test method one");
	        PropertyLoader prop = new PropertyLoader();
	        prop.loadProperty("type");
	    }
}
