package com.common;

public class PowerRecursion {
 
	public int pow;
	//log n 
public int getPower(int x,int y){
	
	if(y==0)
		return 1;
	if(y%2==0){
		if(y==2)
			return x*x;
		else{
			return getPower(getPower(x,y/2),2);
		}
		
	}else{
		return x*getPower(x,y-1);
		
	}
	
}


	public static void main(String[] args) {
	
		PowerRecursion p=new PowerRecursion();
		int sum=p.getPower(2,5);
		System.out.println("sum="+sum);
	}

}
