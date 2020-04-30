package com.common;


import java.io.*;
import java.util.*;
class AthenaHealth1{
    public static int fractionCombination(int n){
        int count=0;
        double j=0;
        HashSet<Double> d=new HashSet<Double>();
        for(int i=1;i<=n;i++){
            for(int k=i+1;k<=n;k++){
                 j=i/k;
                 
                if(j<1.0){
                    boolean flag=d.add(j);
                    if(flag==false){
                        count++;
                    }
                    
                }
            }
        }
     return count;
    }
    public static void main (String[] args) throws Exception{
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      String x=br.readLine();
      int number=Integer.parseInt(x);
      
     System.out.println(fractionCombination(number));
    }
}