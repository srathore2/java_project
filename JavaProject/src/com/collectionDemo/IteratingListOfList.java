package com.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingListOfList {

	public static void main(String[] args) {
		ArrayList<Integer>in1=new ArrayList<Integer>();
		ArrayList<Integer>in2=new ArrayList<Integer>();
		ArrayList<Integer>in3=new ArrayList<Integer>();
		in1.add(10);
		in1.add(10);
		in1.add(10);
		in1.add(10);
		in2.add(11);
		in2.add(11);
		in2.add(11);
		in2.add(11);
		in3.add(12);
		in3.add(12);
		in3.add(12);
		in3.add(12);
		
		ArrayList<List>out=new ArrayList<List>();
		out.add(in1);
		out.add(in2);
		out.add(in3);
	Iterator<List>itr=out.iterator();
	while(itr.hasNext()){
		List l=itr.next();
		Iterator<Integer>itin=l.iterator();
		while(itin.hasNext()){
			System.out.print(" ,"+itin.next());
		}
		
	}
			
			
			
			
		
		
	}

}
