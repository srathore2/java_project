package com.javaalgo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindingDuplicateInArray {

	public static void main(String[] args) {
		
		 int A[]={20,30,45,10,20,10,20,30,45,10};
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		 //Map<Integer,Integer>map=new TreeMap<Integer,Integer>();
		 
		 for(int i=0;i<A.length;i++){
			 Integer count=map.get(A[i]);
			 if(count==null){
				 map.put(A[i],1);
			 }else{
				 map.put(A[i],++count);
			 }
			 
		 }
		 Set<Map.Entry<Integer,Integer>> set = map.entrySet();
			Iterator<Map.Entry<Integer,Integer>> itr = set.iterator();
			while(itr.hasNext()){
				Map.Entry<Integer,Integer> m=itr.next();
				System.out.println("key no="+m.getKey()+"  count= "+m.getValue());
			}

	}

}
/*
 * 
down vote
accepted
Think with me in these steps:

Question 1) Why Cloneable interface at the first place ?

Java needs a way to discriminate whether a class is Cloneable or not. Hence Cloneableinterface.
Question 2) Why is Cloneable interface marker interface or why not keep clone() method in it ?

If clone() method was in Cloneable then there would have been need for the base or default implementation of clone() method.

And what could be a better place to do the base code than Object itself (as every instance is an instance of Object). But if would have done that then clone() method MUST be kept public as it is in interface.

So even if an object would not have been Cloneable it would have had a public clone() method and that would have created all sorts of confusion.
Question 3) Why not create a Cloneable class rather than markable interface ?

Now if the Cloneable would have been a class then any other class which wanted to be cloned would have to extend Cloneable. Right?

But Java does not support multiple inheritance, so a class that wanted to be Cloneable as well as extend some Parent would fail. Hence not a class.
Question 4) Why is default implementation of clone() method in Object ?

Half the answer is given in answer to Question 3. But as all classes  extend Object, the default implementation would always be present to take advantage of and no extension of other class would be required. So all happy.
Question 5) So why is clone() method protected in Object ?

Answer already given with Answer to Question 2. As if it would have been public it would have created all sorts of doubts.
*/
