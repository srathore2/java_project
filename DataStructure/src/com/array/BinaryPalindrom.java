package com.array;

import java.util.Scanner;

public class BinaryPalindrom {
	
	public String isBinaryPalindrome ( int num ){
		  int numOfBits = (int) (Math.floor( ( Math.log( num )/Math.log(2)) ) + 1);
		  System.out.println("number of bits"+numOfBits);
		  int left = 0;
		  int right = numOfBits - 1; 
		  while( left < right ){
		    if( isBitSet( num, numOfBits - left ) != isBitSet( num, numOfBits-right )  ) {
		      return "NO";
		    }
		    left++;
		    right--;
		  }
		  return "YES";
		}

		private boolean isBitSet( int num, int index ){
		  return ( num & (1 << (index - 1 ) ) ) != 0;
		}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		BinaryPalindrom  b=new BinaryPalindrom();
		int num[]=new int[t];
		
		for(int i=0;i<t;i++){
			num[i]=s.nextInt();
		}
		
		for(int i=0;i<t;i++){
			System.out.println(b.isBinaryPalindrome(num[i]));
		}
		
		/*BinaryPalindrom  b=new BinaryPalindrom();
		System.out.println(b.isBinaryPalindrome(4));*/
	
	

	}

}
