package com.example.fw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.example.util.PropertyLoader;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String type = com.example.util.PropertyLoader.loadProperty("type");
    	System.out.println(type);
    }
}
