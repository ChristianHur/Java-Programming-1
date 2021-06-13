
package com.christianhur.varags;

import java.util.Map;
import java.util.TreeMap;

public class Varags {
    public static void main(String[] args) {
//        printSum(new int[]{2,3});
//        printSum(new int[]{2,3,4,5,6,7});
        printSum(1,2,3,4,5,6,7,8,9,3,3,5,6,7,2);
        //printKeys("A","A","C","B","B","C","Z");
    }
    static <Key> void printKeys(Key ... keys){
        Map<Key,Integer> freq = new TreeMap<Key,Integer>();
        for(Key key : keys){
            int count = freq.get(key) == null ? 1 : freq.get(key) + 1;
            freq.put(key,count);
        }
        printResult(freq);
    }

    static <T extends Number> void printSum(T ... numbers){
        int sum = 0;
        for(T n : numbers) sum += n.intValue();
        printResult(sum);
    }
  
  //Overloading varags method is not recommended.
    static <T extends Number> void printSum(double d, int a, T ... numbers){
        int sum = 0;
        for(T n : numbers) sum += n.intValue();
        printResult(sum);
    }

//    static void printSum(int a, int b){
//        printResult(a+b);
//    }
//    static void printSum(int a, int b, int c){
//        printResult(a+b+c);
//    }
    static <T> void printResult(T val){
        System.out.println("Result: " + val);
    }
}

