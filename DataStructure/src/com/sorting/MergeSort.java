package com.sorting;

public class MergeSort {

	public static void mergeSort(int arr[],int l,int r){
		if(l<r){
		
			int m=l+(r-l)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		
	}
		public static void merge(int array[],int left,int mid,int right){
			int i;
			int j;
			int n1=mid-left+1;
			int n2=right-mid;
			
			int arr1[]=new int[n1];
			int arr2[]=new int[n2];
			
			for(i=0;i<n1;i++)
				arr1[i]=array[left+i];
			for(j=0;j<n2;j++)
				arr2[j]=array[mid+1+j];
			i=0;
			j=0;
			int k=left;
			while(i<n1 &&j<n2){
				if(arr1[i]<arr2[j]){
					array[k]=arr1[i];
					i++;
				}else{
					array[k]=arr2[j];
					j++;
				}
				k++;
			}
			while(i<n1){
				array[k]=arr1[i];
				k++;
				i++;
			}
			while(j<n2){
				array[k]=arr2[j];
				k++;
				j++;
			}
			
			
		}
		public static void main(String args[]){
			//MergeSort m=new MergeSort();
		int testArray[]={85,45,1,6,7,68,20};
		MergeSort.mergeSort(testArray,0,testArray.length-1);
		System.out.println("array");
	   for(int i=0;i<testArray.length;i++)
	   System.out.println(testArray[i]);
		}

}
