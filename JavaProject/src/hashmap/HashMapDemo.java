package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import hashmap.*;


public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Emp>hm=new HashMap<String,Emp>();
		hm.put("one", new Emp(100, "ram", "setu"));
		hm.put("Two", new Emp(111, "ram", "setu"));
		hm.put("Ttree", new Emp(110, "rama", "sattu"));
		//hm.put(null, new Emp(112, "ram", "setuunul"));
		//hm.put(null, null);
		 
		 Set<String>key=hm.keySet();
		 Iterator<String>itr=key.iterator();
		 // in one line
		 //Iterator itr2=hm.keySet().iterator();--getting error for duplicate ,unknown source
		// Iterator<String>itr2=hm.keySet().iterator();--same error for this also
		 
		 while(itr.hasNext()){
			 //take key
			 String st=itr.next();
			 Emp e1=hm.get(st);
			 System.out.println(e1);
		 }
		 System.out.println("2nd map");
		 Map<String,Emp>hm1=new HashMap<String,Emp>();
			hm1.put("four", new Emp(112, "sam", "setu"));
			 Set<String>key1=hm1.keySet();
			 Iterator<String>itr1=key1.iterator();
			 while(itr1.hasNext()){
				 //take key
				 String st=itr1.next();
				 System.out.println("string"+st);
				 Emp e2=hm1.get(st);
				 System.out.println(e2);
			 }
			 
			 System.out.println("swap maps");
			 Map<String,Emp>hm3=new HashMap<String,Emp>();
			 hm3=hm1;
			 hm1=hm;
			 hm=hm3;
			 System.out.println("map 1");
			 Set<String>key2=hm.keySet();
			 Iterator<String>itr2=key2.iterator();
			 while(itr2.hasNext()){
				 //take key
				 String st=itr2.next();
				 Emp e1=hm.get(st);
				 System.out.println(e1);
			 }
			 System.out.println("map 2");
			 Set<String>key3=hm1.keySet();
			 Iterator<String>itr3=key3.iterator();
			 while(itr3.hasNext()){
				 //take key
				 String st=itr3.next();
				
				 Emp e2=hm1.get(st);
				 System.out.println(e2);
			 }
			 
		 
		/* System.out.println("##############Key Set For each loop################");
		// for each loop
		 for(Object keys:hm.keySet()){
			 System.out.println(hm.get(keys));
		 }
		 System.out.println("#####EntrySet###########3");
		 Set<Map.Entry<String, Emp>> set=hm.entrySet();
		 Iterator<Map.Entry<String, Emp>>itr3=set.iterator();
		 
		 while(itr3.hasNext()){
			 Map.Entry<String,Emp> keyvalue=itr3.next();
			 System.out.println("key"+keyvalue.getKey()+"value"+keyvalue.getValue());
		 }
		 System.out.println("##########try in one line########### ");
		 Iterator itr4 = hm.entrySet().iterator();
		 while(itr4.hasNext()){
			 Map.Entry<String,Emp> keyvalue=(Map.Entry) itr4.next();
			 System.out.println("key"+keyvalue.getKey()+"value"+keyvalue.getValue());
		 }
		System.out.println("#########for each entry set#######");
		for(Map.Entry<String, Emp> entry:hm.entrySet()){
			System.out.println("key"+entry.getKey()+"value"+entry.getValue());
		}
		System.out.println("##########general map exercise#####");
		 System.out.println(hm.size());
	 */
	}

}
