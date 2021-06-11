package com.javacafe.study.collection_implementation;

import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings({"rawtypes", "unchecked"})
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> simpleMap = new HashSet<>();

        simpleMap.add("가");
        simpleMap.add("나");
        simpleMap.add("다");
        simpleMap.add("라");
        simpleMap.add("마");
        simpleMap.add("바");


        simpleMap.contains("다");
        System.out.println(simpleMap);
    }
}
