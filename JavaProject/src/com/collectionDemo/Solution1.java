package com.collectionDemo;


import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
	 	 Scanner sc=new Scanner(System.in); 
	   	 String  s=sc.nextLine();
	   	 String Arr[] = s.split(" ");
	   	Integer[] intarray=new Integer[Arr.length];
		Integer[] intarray1=new Integer[Arr.length];
	    int i=0;
		Integer[] a=new Integer[8];
	   
	    for(String str:Arr){
	    	
	        intarray[i]=Integer.parseInt(str);//Exception in this line
	        
	        i++;
	    }
	    boolean flag=false;
	    
	    for(int j=2;j<=8;j++){
	    	for(int k=1;k<intarray.length;k++){
	    		intarray1[k-1]=intarray[k]%j;
	    	//	System.out.println(intarray1[k-1]);
	    		
	    	}
	    	
	    for(i=0;i<=7;i++){
	    	a[i]=0;
	    }
	    
	    for(i=0;i<=7;i++){
	    	System.out.println("aaaaaaaa"+a[i]);
	    } 	
	    	
	    	/*for(int l=0;l<intarray1.length-1;l++){
	    		for(int m=l+1;m<intarray1.length-1;m++){
	    			
	    			if(intarray1[l]==intarray1[m]){
	    				flag=false;
	    				
	    				
	    			}else{
	    				flag=true;
	    			}
	    		}
	    	}
	    	if(flag==true){
	    		System.out.println(j);
	    		break;
	    	}*/
	    
	    }
	    
	    sc.close();
	   	 
	}

}
