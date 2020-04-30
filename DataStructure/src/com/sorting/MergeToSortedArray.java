package com.sorting;

public class MergeToSortedArray {

	public static int[] mergeSortedArray(int a[], int b[]){
		
		int ans[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				ans[k]=a[i];
				i++;
				}
			else{
				ans[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length){
			ans[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length){
			ans[k]=b[j];
			j++;
			k++;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int A[]={7,8,9,10};
		int B[]={1,8,10,11};
		System.out.println("sorted array is");
		for(int i:MergeToSortedArray.mergeSortedArray(A,B)){
			System.out.println(i);
		}
		
		

	}

}
