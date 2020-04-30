package com.common;

public class PrintPyramid {
	
	public static void printhalf(int n){
		int k=n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}
			for(int l=k;l<=i;l++){
				System.out.print("*");
			}
			k=k-1;
			System.out.println();
		}
	}
public static void print(int n){
	int x=n;int y=n-2;
	for(int i=1;i<=x ;i++){
		for(int j=1;j<=n;j++){
			System.out.print("*"+" ");
		}
		System.out.println();
		if(n!=1){
			for(int k=1;k<=i;k++)
			System.out.print(" ");
		}
		
		n=n-1;
	}
	
	//System.out.print("*");
	for(int l=1;l<=x-1;l++){
		for(int m=1;m<=y;m++){
			System.out.print(" ");
		}
		for(int k=0;k<=l;k++){
			System.out.print("*"+" ");
		}
		System.out.println();
		y=y-1;
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print(10);
		printhalf(3);
	
	}

}
