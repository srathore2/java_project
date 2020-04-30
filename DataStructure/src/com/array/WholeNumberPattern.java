package com.array;

public class WholeNumberPattern {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("0");
		
		int n=12;
		
		System.out.println(sb);
	  boolean flag=true;
		for(int i=1;i<n;){
			
			if(flag){
				
				//s="1"+s;
				sb.insert(0,"1");
				System.out.println(sb);
				//s=s+"1";
				sb.append("1");
				System.out.println(sb);
				flag=false;
			}else{
				//s="0"+s;
				sb.insert(0,"0");
				System.out.println(sb);
				//System.out.println(s);
				//s=s+"0";
				//System.out.println(s);
				sb.append("0");
				System.out.println(sb);
				flag=true;
			}
			i=i+2;
			
		}


	}

}
