package com.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int array[]= {10,70,4,45,66,0};
		int n=array.length;
		for(int i=1;i<n;i++) {
			int key=array[i];
			int keyindex=i;
			while(  keyindex>=1 && array[keyindex-1]>key) {
				array[keyindex]=array[keyindex-1]; 
				keyindex--;
			}
			array[keyindex]=key;
			System.out.println(Arrays.toString(array));
		}
		//System.out.println(Arrays.toString(array));

	}

}
