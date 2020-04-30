package com.hakerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pnagram {
	

    private static Set<Character> lettersRemaining = new HashSet<>();

		
		public static void Pangram(String s) {
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            lettersRemaining.add(ch);
	        }
	        s = s.toLowerCase();
	        for (int i = 0; i < s.length(); i++) {
	            lettersRemaining.remove(s.charAt(i));
	            System.out.println(s.charAt(i));
	        }
	    }

	    public static boolean isPangram() {
	        return lettersRemaining.isEmpty();
	    }
	 
	    
	    public static void main(String[] args) {
		  
	    	 // Scanner sc=new Scanner(System.in); 
	    	  //System.out.println("Enter string");  
	    	  // String sentance=sc.next();  

	    	Pangram("qwertyuiop asdfghjkl zxcvbnm");
	    	if(isPangram()){
	    	System.out.println("panagram");
	    	}else{
	    		System.out.println("not pa");
	    	}
	    	
	    	 Scanner sc=new Scanner(System.in); 
	    	  System.out.println("Enter string");  
	    	   String sentance=sc.nextLine();  
	    	  

	    	Pangram(sentance);
	    	if(isPangram()){
	    	System.out.println("panagram");
	    	}else{
	    		System.out.println("not pa");
	    	}
	    	
	    	 sc.close(); 
	  }
	}


