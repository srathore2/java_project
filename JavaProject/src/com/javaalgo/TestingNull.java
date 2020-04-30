package com.javaalgo;
//null is treate
public class TestingNull {

	public static void M(String s){
		System.out.println("M");
	}
	public static void M(Object s){
		System.out.println("O");
	}
	public static void main(String[] args) {
		M(null);
	}

}
