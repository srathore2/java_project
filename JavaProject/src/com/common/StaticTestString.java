package com.common;



public class StaticTestString {
	
	int rollno;  
    String name;  
    String college = "ITS";  
     // college="abs";
    void change(){  
   college = "BBDIT";  
    }  
 
    StaticTestString(int r, String n){  
    rollno = r;  
    name = n;  
    }  
 
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // StaticTestString.change();  
		  
	    StaticTestString s1 = new StaticTestString (111,"Karan");  
	    s1.change();
	    StaticTestString s2 = new StaticTestString (222,"Aryan");  
	    StaticTestString s3 = new StaticTestString (333,"Sonoo");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	
		
		
	}

