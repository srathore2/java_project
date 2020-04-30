package com.collectionDemo;

public class Dvdinfo implements Comparable<Dvdinfo> {
	

	public String title;
	public int stock;
	
	public Dvdinfo(String title, int stock) {
		super();
		this.title = title;
		this.stock = stock;
	}
	
	@Override
	public int compareTo(Dvdinfo arg) {
		
		return this.title.compareToIgnoreCase(arg.title);
	}

	@Override
	public String toString() {
		return "Dvdinfo [title=" + title + ", stock=" + stock + "]";
	}

}
