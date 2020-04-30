package com.linkedlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountDuplicateUsingHashMap {

	
	public static void countDuplicate(ListNode head){
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		 //Map<Integer,Integer>map=new TreeMap<Integer,Integer>();
		 
		 while(head!=null){
			 Integer count=map.get(head.getData());
			 if(count==null){
				 map.put(head.getData(),1);
			 }else{
				 map.put(head.getData(),++count);
			 }
			 head=head.getNext();
	     }
		 Set<Map.Entry<Integer,Integer>> set = map.entrySet();
			Iterator<Map.Entry<Integer,Integer>> itr = set.iterator();
			while(itr.hasNext()){
				Map.Entry<Integer,Integer> m=itr.next();
				System.out.println("key no="+m.getKey()+"  count= "+m.getValue());
			}
		 
	} 
}
