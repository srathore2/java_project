package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class SortingUsingComparable {

	public static void main(String args[]){
		
		ArrayList<Dvdinfo> dvd=new ArrayList<Dvdinfo>();
		Dvdinfo d1=new Dvdinfo("satya", 10);
		Dvdinfo d2=new Dvdinfo("dsatya", 10);
		Dvdinfo d3=new Dvdinfo("esatya", 10);
		Dvdinfo d4=new Dvdinfo("aatya", 10);
		Dvdinfo d5=new Dvdinfo("dfatya", 10);
		//OverrideEquals o=new OverrideEquals();
		
		dvd.add(d1);
		dvd.add(d2);
		dvd.add(d3);
		dvd.add(d4);
		dvd.add(d5);
		System.out.println("collection with reverse order");
		//Collections.sort(dvd, Collections.reverseOrder());
		Collections.sort(dvd);
	/*	System.out.println("before");
		System.out.println(dvd);
		System.out.println("after");
		Collections.sort(dvd);
		System.out.println(dvd);
		Collections.reverse(dvd);
		System.out.println(dvd);
		System.out.println("originalyy");
		System.out.println(dvd);
		*/
		Iterator<Dvdinfo> itr=dvd.iterator();
		while(itr.hasNext()){
			Dvdinfo d=itr.next();
			System.out.println(d.title+"  "+d.stock);
			
		}
		
		
		
		
		
	}
}
