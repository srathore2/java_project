package com.search;

public class SearchinInFiniteArray {

	public static int iteratveBinary(int arr[],int x){
		int l=0;
		int r=1;
		int interval=arr[0];

		//int interval=10;
		
		while(x>interval){
			l=r;
			r=r*2;
			interval=arr[r];
			
		}
		
		System.out.println("l="+l+"r="+r+"value = "+x);
		 int position=BinarySearch.recursiveBinary(arr,l,r,x ) ;
		
			
			
			
		return position;
	}
	
	
	public static void main(String[] args) {
		
	     int testArry[]={1,2,3,4,5,6,7,8,9,10,11,12,13,15,16};
	     int position=SearchinInFiniteArray.iteratveBinary(testArry,8);
	     
	     System.out.println("element is found at position= "+(position+1));
	     

		}
		
}
