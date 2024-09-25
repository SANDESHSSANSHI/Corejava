package com.tnisf.testing;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumeDemo {

    @Test
    void testAssumption() {
        int a = 5, s = 25;
        Assumptions.assumeTrue(s != a * a);
        System.out.println("Test executed");//this will not execute coz 25 i s= to 5*5
    }
    
    @Test
    public void testAssuptions() {
    	int a=5,b=5;
    	Assumptions.assumingThat(a==b,()-> System.out.println("Test executed bro"));// this will execute 
    }
}
