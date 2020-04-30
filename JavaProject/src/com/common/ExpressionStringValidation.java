package com.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExpressionStringValidation {
	public static boolean validateString(String string){
		char s[]=string.toCharArray();
		/*Map<Character,Boolean>map=new HashMap<Character, Boolean>();
		map.put('*',true);
		map.put('+',true);
		map.put('-',true)
		map.put('/',true);*/
		Set<Character>set=new HashSet<Character>();
		set.add('*');
		set.add('+');
		set.add('/');
		set.add('-');
		set.add(')');
		set.add('(');
		int count=0;
		int prev=0;
	    int curr=1;
	  //  for 1st and las
	    if(set.contains(s[0]) ||set.contains(s[s.length-1])){
	    	return false;
	    }
	   
	    
	    while(curr<s.length){
	    	//System.out.println("inside 1st loop");
	    	
	    	        if(set.contains(s[prev])){
	    		   {
	    			if(set.contains(s[curr])){
	    				return false;
	    			}
	    			  
	    		 }
	    		  
	    		  
	    	}
	    	           prev=curr;
		    		   curr=curr+1;
	    }
	    
		for(int i=0;i<s.length;i++){
			//System.out.println("inside 2nd loop");
			if(s[i]=='('&& count>=0){
				count++;
			}
			if(s[i]==')'&& count>=0){
				count--;
			}
			
			
		}
		if(count==0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("given string is "+validateString("10+10+2098"));
	}

}
