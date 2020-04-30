package com.sorting;

import java.util.Arrays;

public class MedianOfTwoArray {
	public static int medianViaMerging(int arr1[],int arr2[],int n){
	 int i=0;
	 int j=0;
	 int count=0;
	 int m1=-1;
	 int m2=-1;
	 for(count=0;count<=n;count++){
		 if(i==n){
			 m1=m2;
			 m2=arr2[0];
		  }
		 if(j==n){
			 m1=m2;
			 m2=arr1[0];
		 }
		 if(arr1[i]<arr2[j]){
			 m1=m2;
			 m2=arr1[i];
			 i++;
		 }else{
			 m1=m2;
			 m2=arr2[j];
			 j++;
		 }
		 
	 }
	 return (m1+m2)/2;
	}
public static int medianViaDevideAndConqure(int arr1[],int arr2[],int n){
	int m1;
	int m2;
	if(n<=0)
		return -1;
	if(n==1)
		return (arr1[1]+arr2[2])/2;
	if(n==2)
		return (Math.max(arr1[0], arr2[0])+Math.min(arr1[1], arr2[1]))/2;
	m1=getMedian(arr1,n);
	m2=getMedian(arr2,n);
	if(m1==m2){
		return m1;
	}
	if(m1<m2){
		if(n%2==0){
			return medianViaDevideAndConqure(arr1=Arrays.copyOfRange(arr1,n/2-1,n-1),arr2,n-n/2+1);
		}
		else{
			return medianViaDevideAndConqure(arr1=Arrays.copyOfRange(arr1, n/2,n-1),arr2,n-n/2);
		}
	}else{
		if(n%2==0){
			return medianViaDevideAndConqure(arr2=Arrays.copyOfRange(arr2,n/2-1,n-1),arr1,n-n/2+1);
		}
		else{
			return medianViaDevideAndConqure(arr2=Arrays.copyOfRange(arr2, n/2,n-1),arr1,n-n/2);
		}
	}

}
public static int getMedian(int arr[],int n){
	if (n%2 == 0)
        return (arr[n/2] + arr[n/2-1])/2;
    else
        return arr[n/2];
}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={2,4,5,6,7};
	int m=MedianOfTwoArray.medianViaMerging(a,b,a.length);
	System.out.println("median is"+m);
	int n=	MedianOfTwoArray.medianViaDevideAndConqure(a,b,a.length);
	System.out.println("median by devide and conqure"+n);
	}

}
