package com.tp.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	Map<String,String> tm = new TreeMap<String,String>();
	
	
	/*tm.put("three","CCC");
	tm.put("two", "BBB");
	tm.put("one","AAA");*/
	
	tm.put("A","CCC");
	tm.put("B", "BBB");
	tm.put("C","AAA");
	
	
	Set<String> set = tm.keySet();
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext())
	{
		String it = itr.next();
		System.out.println(tm.get(it));
		
	}
	
}
}
// It will sort on the basis of key