package oracle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.TreeSet;
class Test1 {
    int i = 20;
}
public class Test {

	public  static  void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		String s3="abc";
		String s4="abc";
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s4==s3);
		
        

	}
}
