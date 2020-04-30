package com.common;

public class OnmobileLast {

	public static void main(String[] args) {
		String s="aaaeiioooaauuaeiou";
		String wavel="aeiou";
		char string[]=s.toCharArray();
		char wavelArray1[]=wavel.toCharArray();
		int m=0;
		for(;m<wavelArray1.length;m++){
			if(wavelArray1[m]!='a'){
				break;
			}
		}
		
		char wavelArray[]=wavel.toCharArray();
	    int count=1;
	    
	    int k=0;
	    for(int i=m;i<string.length;i++){
	    	if(k!=4){
	    		if(wavelArray[k]==string[i]){
		    		count++;
		    	}else if(wavelArray[k+1]==string[i]){
		    		k++;
		    		count++;
		    	}
	    	}else{
	    		if(wavelArray[k]==string[i]){
	    			count++;
	    		}
	    	}
	    	 		
	    }
	    
	    if(k==4){
	    	System.out.println(count);
	    }
	    else{
	    	System.out.println(0);
	    }
	}

}
