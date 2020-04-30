package com.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ShortID {

	public static int shortid() throws IOException{
		
		int a[]=new int[5];
		InputStreamReader r=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(r);
	    String x=br.readLine();
	    String s[]=x.split(" ");
	    Set<Integer>set=new HashSet<>();
	    boolean flag=true;
	    int mod=0;
	    int i;
	    for(i=2;i<=99999999;i++)
	    {     int j;
	    	for( j=0;j<s.length && flag==true;j++){
	    		if(set.add(Integer.parseInt(s[j])%i)){
	    			flag=true;
	    		}else{
	    			flag=false;
	    		}
	    	}
	    	if(flag==true){
	    		mod=i;
	    		break;
	    	}else{
	    		flag=true;
	    		set.clear();
	    	}
	    }
	    return mod;
	  }
	
	
	public static void main(String[] args) throws IOException {
	
		
		int a=shortid();
		System.out.println("short id mod is "+a);
		
	}

}
