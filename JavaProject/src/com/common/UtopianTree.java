package com.common;

public class UtopianTree {
	
	public static int utoPiea(int x){
		int sum=1;
		for(int i=1;i<=x;i++){
			
			if(i%2==1){
			sum=sum*2;
			}else{	
				sum=sum+1;
			}
	
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int z=	utoPiea(0);
	System.out.println(z);
	 z=	utoPiea(1);
	System.out.println(z);
 z=	utoPiea(4);
	System.out.println(z);
	}

}
