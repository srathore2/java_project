package com.array;


import java.util.ArrayList;
import java.util.Scanner;
public class Test {
static int count;
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num = Integer.parseInt(s.next());
ArrayList<Double> al = new ArrayList();
for (int x = 1; x <= num; x++) {
for (int y = x+1; y <= num; y++) {

double result = (double) x / y;
if (!al.contains(result)) {
	al.add(result);
	count++;

}
}

}
System.out.println(count);
}
}