package com.common;

import java.util.Arrays;

public class MagicSquare {
	public static void generateSquare(int n)
	{
	    int magicSquare[][]=new int[n][n];
	 
	    // set all slots as 0
	    //memset(magicSquare, 0, sizeof(magicSquare));
	    for(int row[]:magicSquare)
	    Arrays.fill(row,0);
	    // Initialize position for 1
	    int i = n/2;
	    int j = n-1;
	 
	    // One by one put all values in magic square
	    for (int num=1; num <= n*n; )
	    {
	        if (i==-1 && j==n) //3rd condition
	        {
	            j = n-2;
	            i = 0;
	        }
	        else
	        {
	            //1st condition helper if next number goes to out of square's right side
	            if (j == n)
	                j = 0;
	            //1st condition helper if next number is goes to out of square's upper side
	            if (i < 0)
	                i=n-1;
	        }
	        if (magicSquare[i][j]!=0) //2nd condition
	        {
	            j -= 2;
	            i++;
	            continue;
	        }
	        else
	            magicSquare[i][j] = num++; //set number
	 
	        j++;  
	        i--; //1st condition
	    }
	       for(int x=0;x<n;x++){
	    	   for(int y=0;y<n;y++){
	    		   System.out.print("   "+magicSquare[x][y]);
	    	   }
	    	   System.out.println();
	       }
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateSquare(7);

	}

}
