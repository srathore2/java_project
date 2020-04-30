package com.array;
//amazon interview quetion
public class ReplaceElementWithGretestRight {
public static void replaceElementWithGretestRight(int a[]){
	int size=a.length;
	int maxFromRight=a[size-1];
	a[size-1]=-1;
	for(int i=size-2;i>=0;i--){
		int temp=a[i];
		a[i]=maxFromRight;
		if(maxFromRight<temp)
			maxFromRight=temp;
	}
	for(int x=0;x<a.length;x++){
		System.out.println(a[x]);
	}
}

	public static void main(String[] args) {
		int array[]={16, 17, 4, 3, 5, 0};
		replaceElementWithGretestRight(array);
	}

}
