package com.tp.common;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;
	private int quantity;
 
	public Fruit(String fruitName, int quantity) {
		super();
		this.fruitName = fruitName;
		this.quantity = quantity;
	}
 
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*public int compareTo(Fruit f)
	{
		return this.fruitName.compareTo(f.fruitName);
	}*/
	public int compareTo(Fruit f)
	{
		/*int i =f.quantity;
		int j =this.quantity;
		return j.*/
	
		Integer i = f.quantity;
		Integer j=this.quantity;
		return j.compareTo(i);
	}
}
