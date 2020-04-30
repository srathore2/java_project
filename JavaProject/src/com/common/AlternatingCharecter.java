package com.common;

import java.util.Scanner;

public class AlternatingCharecter {

	public static int Alternate(String s) {
		char[] sarry = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (sarry[i] == sarry[i + 1]) {
				sum = sum + 1;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String string = sc.next();
			int s = Alternate(string);
			System.out.println(s);
		}
		sc.close();
	}

}
