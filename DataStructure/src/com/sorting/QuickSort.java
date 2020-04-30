package com.sorting;

public class QuickSort {
public static void quickSort(int arr[],int low,int high){
	
	int pivote;
	if(low<high){
		pivote=partition(arr,low,high);
		quickSort(arr,low,pivote-1);
		quickSort(arr,pivote+1,high);
	}
}
public static int partition(int array[],int low,int high){
	int left=low;
	int right=high;
	int pivote=array[left];
	while(left<right){
		
		while(array[left]<pivote)
			left++;
		while(array[right]>pivote)
			right--;
		if(left<right){
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
		}
	}
	//right is final position for pivote
	/*array[left]=array[right];
	array[right]=pivote;*/
	return right;
}

	
	
	public static void main(String[] args) {
		
 int a[]={78,41,1,2,8,19,80,4,0,5};
 QuickSort.quickSort(a, 0, a.length-1);
 for(int i=0;i<a.length;i++){
	 System.out.println(a[i]);
 }
	}

}
