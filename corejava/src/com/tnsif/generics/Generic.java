package com.tnsif.generics;

import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) 
    {

        ArrayList<String> list=new ArrayList<String>();
        list.add("JAVA");
        list.add(123, null);

        for (Object object : list) {
        	String str=(String)object;
            System.out.println(str);
        }
    }
}
