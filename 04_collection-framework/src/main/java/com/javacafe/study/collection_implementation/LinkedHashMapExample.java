package com.javacafe.study.collection_implementation;

import java.util.HashMap;
import java.util.LinkedHashMap;

@SuppressWarnings({"rawtypes", "unchecked"})
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> simpleMap = new LinkedHashMap<>();

        simpleMap.put("가", 1234);
        simpleMap.put("나", 2234);
        simpleMap.put("다", 1434);
        simpleMap.put("라", 1534);
        simpleMap.put("마", 1734);
        simpleMap.put("바", 234);
        simpleMap.put("사", 1224);
        simpleMap.put("아", 1254);
        simpleMap.put("자", 1214);
        simpleMap.put("차", 1294);
        simpleMap.put("카", 1231);
        simpleMap.put("타", 1237);
        simpleMap.put("파", 1239);
        simpleMap.put("하", 123);

        simpleMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
