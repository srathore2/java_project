package com.tp.common;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapIterator {
	public static void main(String[] args) {
		Map<String, Emp> hm = new HashMap<String, Emp>();
		
		hm.put("one",new Emp(111, "Tej", "Pratap",new Address(12,"MG Road","Bangalore")));
		hm.put("two",new Emp(112, "Ravi", "Singh",new Address(13,"Lake road","Bhopal")));
		hm.put("two",new Emp(113, "Ravi Pratap", "Singh",new Address(14,"Palasiya road","Indore")));
		hm.put(null,new Emp(114, "Manoj", "Singh",new Address(15,"Semariya road","Satna")));
		hm.put(null,new Emp(115, "Raj", "Singh",new Address(16,"Bharhut road","Satna")));
		hm.put(null,null);
		Set<String> key = hm.keySet();
		Iterator<String> itr =key.iterator();
		
		while(itr.hasNext())
		{
			String st = itr.next();
			Emp emp = hm.get(st);
			if(emp!=null)
			System.out.println("Emp id: "+emp.getId()+" Emp Name: "+emp.getName()+" Emp Sname: "+emp.getSname()+" steet no: "+emp.getAdd().getStno());
		}
		
		
		/*Set<Map.Entry<String,Emp>> set = hm.entrySet();
		Iterator<Map.Entry<String,Emp>> itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Emp> keyval = itr.next();
			//System.out.println("key: "+keyval.getKey()+" EMP : "+keyval.getValue());
			System.out.println("key :"+keyval.getKey());
			Emp emp=keyval.getValue();
			if(emp!=null)
			System.out.println("Emp id: "+emp.getId()+" Emp Name: "+emp.getName()+" Emp Sname: "+emp.getSname()+" steet no: "+emp.getAdd().getStno());
		}*/
	}

}
