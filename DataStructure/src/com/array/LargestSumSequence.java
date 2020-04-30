package com.array;

public class LargestSumSequence {
	
	public static int maxSubArraySum(int []a,int size){
		int max_so_far = 0, max_ending_here = 0;
		for(int i=0;i<size;i++){
			max_ending_here=max_ending_here+a[i];
			
			if(max_so_far<max_ending_here){
				max_so_far=max_ending_here;
			}
			if(max_ending_here<0){
				max_ending_here=0;
			}
		}
		return max_so_far;
	}
	
//	recursive
	public static int maxSubArraySum2(int b[], int size1)
	{
	   int max_so_far = b[0];
	   int curr_max = b[0];
	 
	   for (int i = 1; i < size1; i++)
	   {
	        curr_max = Math.max(b[i], curr_max+b[i]);
	        max_so_far =Math.max(max_so_far, curr_max);
	   }
	   return max_so_far;
	}
	 
	
	public static void main(String[] args) {
		int a[] = {-2, -3, 4, 1, -2, 5, -5, -3};
	    int s=LargestSumSequence.maxSubArraySum(a,a.length);
	    int s1=LargestSumSequence.maxSubArraySum2(a, a.length);
	    System.out.println("Mximum sum array is"+s);
	    System.out.println("2nd method"+s1);
	}

}
