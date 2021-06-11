package com.javacafe.study.collection_implementation;

import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings({"rawtypes", "unchecked"})
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> simpleMap = new HashMap<>();

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

        // 해시맵 내부 사이즈 32
        // simpleMap.keySet().stream().forEach(a -> System.out.println(a + " " + (a.hashCode() & 31)));
        //
        // 가 0
        // 타 0
        // 다 4
        // 아 4
        // 마 8
        // 차 8
        // 사 12
        // 파 12
        // 자 16
        // 바 20
        // 카 20
        // 나 24
        // 하 24
        // 라 28

        // "카"를 찾아오는 과정
        // "카".hashCode => 52852
        // 비트 AND 연산 수행 -> 31 & 52852 -> (2진수) 1100111001110100 & 0000000000011111 -> 10100 -> (10진수) 20
        // 20번째 배열 조회
        //   첫번째값 -> 바 (매칭안됨)
        //   두번째값 -> 카 (매칭됨)
        //   두번째값 반환
        simpleMap.get("카");


        System.out.println(simpleMap);
    }
}
