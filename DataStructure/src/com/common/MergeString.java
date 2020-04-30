package com.common;

public class MergeString {

	public static void main(String[] args) {
		String s="abcigh";
		String wavel="def";
		char string[]=s.toCharArray();
		char wavelArray[]=wavel.toCharArray();
		int length1=s.length();
		int length2=wavel.length();
		int length3=length1+length2;
		char newstring[]=new char[length3];
		int i=0;
		int k=0;
		while(i<length1 && i<length2){
			
			newstring[k++]=string[i];
		    newstring[k++]=wavelArray[i];
			i++;
		}
		while(i<length1){
			newstring[k++]=string[i++];
		}
		while(i<length2){
			newstring[k++]=wavelArray[i++];
		}
		String finalstring=new String(newstring);
		System.out.println(finalstring);
	}

}
