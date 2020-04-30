package com.common;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AthenaHealth2 {
	
	public static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {

		// Convert Map to List
		List<Map.Entry<String, Integer>> list = 
			new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
				//return (o1.getValue()).compareTo(o2.getValue());
				if(0==(o2.getValue()).compareTo(o1.getValue())){
					return (o1.getKey()).compareTo(o1.getKey());
				}else{
					return (o2.getValue()).compareTo(o1.getValue());
				}
			}
		});
     
		// Convert sorted map back to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static void main(String[] args) throws IOException {
		
		  InputStreamReader r=new InputStreamReader(System.in);
	      BufferedReader br=new BufferedReader(r);
	      String x=br.readLine();
	      String a[]=x.split(" ");
	      int n1=Integer.parseInt(a[0]);
	      int n2=Integer.parseInt(a[1]);
	      System.out.println("number one is "+n1);
	      System.out.println("number two is "+n2);
	      String para[]=new String[n1];
	      for(int i=0;i<n1;i++){
	    	  para[i]=br.readLine();
	      }
	 
	      Map<String,Integer>map=new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);
	      System.out.println("para.length"+para.length);
	      for(int k=0;k<para.length;k++){
	    	  String buffer[]=para[k].split(" ");
	    	  for(int l=0;l<buffer.length;l++){
	    		  if(buffer[l].startsWith("#")){
	    			  Integer count=map.get(buffer[l]);
	    			  if(count==null){
	 					 map.put(buffer[l],1);
	 				 }else{
	 					 map.put(buffer[l],++count);
	 				 }
	    			
	    		  }
	    		  
	    	  }
	      }
	      Map<String, Integer> sortedMap = sortByComparator(map);
	      Set<Map.Entry<String,Integer>> set = sortedMap.entrySet();
			Iterator<Map.Entry<String,Integer>> itr = set.iterator();
			for(int m=1;m<=n2 && itr.hasNext();m++){
				Map.Entry<String,Integer> mapobj=itr.next();
				System.out.println(mapobj.getKey());
			}
	     		
	     
	}

}
