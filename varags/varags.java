/*
MIT License

Copyright (c) 2021 Christian Hur (Gateway Technical College)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/


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

