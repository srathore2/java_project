package com.tp.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Map<String,String> hm = new LinkedHashMap<String,String>();
		Map<String,String>hm = new ConcurrentHashMap<String,String>();
		hm.put("one","Tej");
		hm.put("two", "Pratap");
		hm.put("three","Singh");
		System.out.println("Before iteration :"+hm);
		Set<String> key = hm.keySet();
		Iterator<String> itr = key.iterator();
		while(itr.hasNext())
		{
			String it = itr.next();
			//hm.put("four","ram");
			
			//if(it.equals("two"))
			//{System.out.println("inside");
				hm.put(it+"22","ram");
			//}
			//hm.remove("two");
			//itr.remove();
			/*if(it.equals("two"))
			{
				itr.remove();
			}*/
			
			//System.out.println(it);
			
			//System.out.println("HM 1"+hm);
			//hm.remove("two");
			
			//System.out.println("HM 2:"+hm);
			
	
			//System.out.println("while iteration : "+hm);
			System.out.println(it + "--" + hm.get(it));
			
			/*if(it.equals("two"))
			{System.out.println("inside");
				hm.remove(it);
			}*/
			
			
			//System.out.println(hm.get(it));
		}
		System.out.println("AFTER ITERATION :"+hm);

	}

}
// ??  if will update while iterating in concurrent hahmap , when it will update original one .while iterating it will be available in output or not.
// linked hash map output will be in that order in which order will insert into map.
//why four times executing when i m adding..