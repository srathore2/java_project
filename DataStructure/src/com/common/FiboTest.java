package com.common;

public class FiboTest {
	
	//time complexity exponetial space o(n)
	public int recusivefibonici(int n){
		/*if(n==0)
			return 0;
		if(n==1)
			return 1;*/
		if(n<=1){
			return n;
		}
		
		return recusivefibonici(n-1)+recusivefibonici(n-2);
		
		
	}

	
	//iterative
	public  int iterativeFibo(int n){
		int a=-1;
		int b=1;
		int c=0;
		for(int i=0;i<=n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		return c;
	}
	
	//dp
	int fib(int n)
	{
	  /* Declare an array to store Fibonacci numbers. */
      int f[]=new int[n+1];
	  int i;
	 
	  /* 0th and 1st number of the series are 0 and 1*/
	  f[0] = 0;
	  f[1] = 1;
	 
	  for (i = 2; i <= n; i++)
	  {
	      /* Add the previous 2 numbers in the series
	         and store it */
	      f[i] = f[i-1] + f[i-2];
	  }
	 
	  return f[n];
	}
	public static void main(String saa[]){
		FiboTest n=new FiboTest();
		int fib=n.recusivefibonici(10);
		System.out.println(fib);
		System.out.println("iterative method");
		int fib2=n.iterativeFibo(10);
		System.out.println("nth fibonici number is"+fib2);
		int fib3=n.fib(10);
		System.out.println("by dp"+fib3);
	
	}
}



