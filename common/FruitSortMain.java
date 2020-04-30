package com.tp.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitSortMain {
	public static void main(String[] args) {
		
		ArrayList<Fruit> list =new ArrayList<Fruit>(); 
		Fruit pineappale = new Fruit("Pineapple",70); 
		Fruit apple = new Fruit("Apple",100); 
		Fruit orange = new Fruit("Orange",80); 
		Fruit banana = new Fruit("Banana",90); 
 
		list.add(pineappale);
		list.add(apple);
		list.add(orange);
		list.add(banana);
		Collections.sort(list);
		
 
		int i=0;
		for(Fruit temp: list){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
 
	}	
	}
	
class compOnFruitName implements Comparable<Fruit>
{

	@Override
	public int compareTo(Fruit f) {
		// TODO Auto-generated method stub
		//return this .
		
	//	return this.fruitName.compareTo(f.fruitName);
		return 0;
	}
	
}



