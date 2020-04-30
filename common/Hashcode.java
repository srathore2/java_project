package com.tp.common;

public class Hashcode {
	
	
	public static void main(String args[]){
		
		String s1=new String("abc");
		String s2="abc";
		String s3=new String("abc");
		String s4="abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
		
	}

}
