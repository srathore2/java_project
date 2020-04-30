package com.javaalgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

	public static void print(List<String> list){
		
		
		 String A[]=list.toArray(new String[list.size()]);
			Map<String,Integer>map=new HashMap<String,Integer>();
			 
			 
			 for(int i=0;i<A.length;i++){
				 Integer count=map.get(A[i]);
				 if(count==null){
					 map.put(A[i],1);
				 }else{
					 map.put(A[i],++count);
				 }
				 
			 }
			 Set<Map.Entry<String,Integer>> set = map.entrySet();
				Iterator<Map.Entry<String,Integer>> itr = set.iterator();
				while(itr.hasNext()){
					Map.Entry<String,Integer> m=itr.next();
					System.out.println(m.getKey()+" "+m.getValue());
				}
	}
	public static void main(String[] args) {
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("str1");
		s.add("str2");
		s.add("str1");
		s.add("str2");
		s.add("str1");
		s.add("str3");
		print(s);
		
		

	}

}
