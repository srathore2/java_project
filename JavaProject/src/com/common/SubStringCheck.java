package com.common;

import java.util.Scanner;

public class SubStringCheck {

	public static String sub(String s,String p){
		String Flag="NO";
		int sl=s.length();
		
		char[] sarry=s.toCharArray();
		for(int i=0;i<sl-1;i++){
			
			String str = Character.toString(sarry[i]);
			if(p.contains(str)){
				Flag="YES";
			}
		}
		return Flag;
	}
	public static void main(String[] args) {
		
	   	 Scanner sc=new Scanner(System.in); 
	   	 int t=sc.nextInt();
	   	for(int i=0;i<t;i++){
	   		 String string=sc.next();
	   		 String string1=sc.next();
			String s = sub(string,string1);
			System.out.println(s);
		}
		sc.close();
		
	}

}
