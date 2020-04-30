package com.hakerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {
	public static void main(String[] args) throws IOException
	{
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String line = br.readLine() ;
        
       String Arr[] = line.split(" ") ;
        
       
       int T = Integer.parseInt(Arr[0]);
       int M = Integer.parseInt(Arr[1]);
       for(int i=0 ; i<Arr.length ; i++){
    	   System.out.println(Arr[i]);
       }
    	   
    	   
    	
       //System.out.println(s);
	}
}
