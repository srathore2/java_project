package com.array;

import java.util.*;
public class ClosestNumber {


 static void partitioning(int[] ar, int left, int right) {
  if (left >= right) return;
  else {
   int p = ar[right];
   int i = left, j = left;
   while (j < right) {

    if (ar[j] > p) {
     j++;
     continue;
    } else {
     swap(ar, i, j);
     i++;
     j++;
    }
   }
   int temp = ar[i];
   ar[i] = ar[j];
   ar[j] = temp;
   partitioning(ar, left, i - 1);
   partitioning(ar, i + 1, right);

  }

 }

 private static void swap(int[] ar, int i, int j) {

  if (i >= j) return;
  else {

   int temp = ar[j];
   ar[j] = ar[i];
   ar[i] = temp;
  }
 }


 private static Scanner in = new Scanner(System. in );

 public static void main(String[] args) {

  int n = in .nextInt(); in .nextLine();
  String numbers = in .nextLine();
  StringTokenizer st = new StringTokenizer(numbers, " ");
  int[] ar = new int[n];
  int i = 0;
  while (st.hasMoreTokens()) {
   ar[i] = Integer.parseInt(st.nextToken());
   i++;
  }
  partitioning(ar, 0, (ar.length - 1));

  int min = Integer.MAX_VALUE;
  String result = "";
  for (int j = 1; j < ar.length; j++) {
   if (ar[j] - ar[j - 1] < min) {
    min = ar[j] - ar[j - 1];
    result = Integer.toString(ar[j - 1]) + " " + ar[j];
   } else if (ar[j] - ar[j - 1] == min) {
    result += " " + Integer.toString(ar[j - 1]) + " " + ar[j];
   }
  }
  System.out.print(result);
 }
}
