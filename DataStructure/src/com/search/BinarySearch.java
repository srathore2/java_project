package com.search;

public class BinarySearch {
	
	//iterative binary search
	public static int iteratveBinary(int arr[],int x){
		int l=0;
		int r=arr.length-1;
		
		while(l<=r){
			int mid=l+(r-l)/2;
			if(arr[mid]==x){
				return mid;
			}
			if(arr[mid]<x){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		return -1;
	}
	
	//recursive binary search 
	public static int recursiveBinary(int arr[],int l,int r,int x){
		if(l<r){
		int mid=l+(r-l)/2;
		if(arr[mid]==x)return mid;
		if(arr[mid]<x)
			return recursiveBinary(arr,mid+1, r, x);
		else
			return recursiveBinary(arr, l, mid-1, x);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
     int testArry[]={1,2,3,4,5,6,7,8,9};
     int position=BinarySearch.iteratveBinary(testArry,0);
     int position2=BinarySearch.recursiveBinary(testArry, 0,testArry.length-1,0);
     System.out.println("element is found at position= "+(position+1));
     System.out.println("element by recursive search="+(position2+1));


	}
	

}
