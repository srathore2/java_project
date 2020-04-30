package com.javaalgo;

public class Reverse {
public void reverseStringUsingStringBuffer(String s){
	StringBuilder s1=new StringBuilder(s);
	System.out.println("reverse of String is= "+s1.reverse());
}
public void reverseStringViaCharacterArray(String s){
	char a[]=s.toCharArray();
	for(int i=0;i<a.length/2;i++){
		char temp=a[i];
		     a[i]=a[(a.length-1)-i];
       a[(a.length-1)-i]=temp;  
	}
	String s1=new String(a);
	System.out.println("reverse via array:"+s1);
}
public void recursiveReverseOfString(String string){
	char s[]=string.toCharArray();
	reverse(s,0,s.length-1);
	String s1=new String(s);
	System.out.println("reverse of string is :"+s1);
}
public void reverse(char x[],int i,int j ){
	if(i<j){
	       char tmp = x[i];
	       x[i] = x[j];
	       x[j] = tmp;
	       reverse(x, ++i, --j);//Recursive
	    }   
}
public static String recursiveReveerseBySubstring(String str){
	if(str.length()<=1){
		return str;
	}
	else return recursiveReveerseBySubstring(str.substring(1))+str.charAt(0);
}
	
	public static void main(String[] args) {
		Reverse s=new Reverse();
		s.reverseStringUsingStringBuffer("Raja");
		s.reverseStringViaCharacterArray("Raja");
		s.recursiveReverseOfString("string");
		
		System.out.println(recursiveReveerseBySubstring("swayam"));
	}

}

/*1. String class in java do not have reverse() method , StringBuilder class does have built in reverse() method.
2. StringBuilder class do not have toCharArray() method , while String class does have toCharArray() method.*/


