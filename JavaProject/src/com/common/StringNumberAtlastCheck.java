package com.common;

public class StringNumberAtlastCheck {
	

	public static void main(String[] args) {
		
		String s="geeksforgeeks13";
		int length=s.length();
		System.out.println("length:"+length);
		System.out.println(s.charAt(length-1));
		int count =0;
	
		for(int i=length;i>0;i--){
			if(Character.isDigit(s.charAt(i-1))){
				count++;
			}
		}
		System.out.println("count is"+count);
		System.out.println("number string "+s.substring(length-count, length));
		Integer number=Integer.parseInt(s.substring(length-count, length));
		int stringlength=length-count;
		if(number==stringlength){
			System.out.println("ture");
		}else{
			System.out.println("false");
		}
		
	}

}
