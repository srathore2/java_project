package com.collectionDemo;


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int arr[]={1,2,4,8,16};
	 	 Scanner sc=new Scanner(System.in); 
	   	 String  s=sc.nextLine();
	   	 String Arr[] = s.split(" ");
	   	Integer[] intarray=new Integer[Arr.length];
	    int i=0;
	    int sum=0;
	    for(String str:Arr){
	    	
	        intarray[i]=Integer.parseInt(str);//Exception in this line
	        if(intarray[i]>=5&&intarray[i]<0){
	        	System.out.println("invalid input");
	        	break;
	        }else{
	        	sum=sum+arr[intarray[i]];
	        }
	        i++;
	    }
	    System.out.println("sum is "+sum);
	    sc.close();
	   	 
	   	 
	   	 
	        

	}

}
