package com.common;

import java.lang.management.GarbageCollectorMXBean;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Snippet
{
   public static void main(String args[])
   {
      String string;
      int i, c, length;
      int count =0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
 
      length = string.length();   
      Set<String> set=new HashSet<String>();
 
      System.out.println("Substrings of \""+string+"\" are :-");
 
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <=length - c ; i++ )
         { 
        	 
           String sub = string.substring(c, c+i);
           
            set.add(sub);
            System.out.println("substring at index c= "+c+", c+i= "+(c+i)+ " "+sub);
            count++;
         }
      }
      System.out.println("count is"+count);
      System.out.println("set size is "+set.size());
   }
}

