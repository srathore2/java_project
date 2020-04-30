package com.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAgicCardProblem {

	public static void main(String[] args) throws IOException {
		
    int array[]={1,2,4,8,16};
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    String x=br.readLine();
    String s[]=x.split(" ");
    
    
    int sum=0;
    for(int i=0;i<s.length;i++){
    	sum=sum+array[Integer.parseInt(s[i])];
    }
    System.out.println(sum);
    
    
	}

}
