package com.javacafe.study.collection_api;

import java.util.HashMap;
import java.util.Map;

public class MapApi {
    public static void main(String[] args) {
        mapApiExample01();
        mapApiExample02();
        mapApiExample03();
        mapApiExample04();
        mapApiExample05();
    }

    public static void mapApiExample01() {
        Map<Integer, String> languageMap = new HashMap<>();

        // 요소 추가하기
        languageMap.put(10, "JAVA");
        languageMap.put(20, "C++");
        languageMap.put(30, "KOTLIN");

        // 내부 데이터 확인하기
        System.out.println(languageMap);

        // 리스트 사이즈 조회하기
        int size = languageMap.size();
        System.out.println("Size of map:" + size);

        System.out.println(languageMap.containsKey(10));
        System.out.println(languageMap.containsValue("C++"));
    }

    public static void mapApiExample02() {
        Map<Integer, String> languageMap = new HashMap<>();

        // 요소 추가하기
        languageMap.put(10, "JAVA");
        languageMap.put(10, "LUA");
        languageMap.put(20, "C++");
        languageMap.put(30, "KOTLIN");
        languageMap.put(30, "RUST");

        // 내부 데이터 확인하기
        System.out.println(languageMap);

        // 리스트 사이즈 조회하기
        int size = languageMap.size();
        System.out.println("Size of map:" + size);
    }

    public static void mapApiExample03() {
        Map<Integer, String> languageMap = new HashMap<>();
        languageMap.put(10, "JAVA");
        languageMap.put(20, "C++");
        languageMap.put(30, "KOTLIN");

        languageMap.remove(10);
        // 삭제 결과 확인
        System.out.println(languageMap);
    }

    public static void mapApiExample04() {
        Map<Integer, String> languageMap = new HashMap<>();
        languageMap.put(10, "JAVA");
        languageMap.put(20, "C++");
        languageMap.put(30, "KOTLIN");

        languageMap.clear();
        // 전부 삭제!
        System.out.println("Map after calling clear() method:" + languageMap);
    }

    public static void mapApiExample05() {
        Map<Integer, String> languageMap = new HashMap<>();

        // 요소 추가하기
        languageMap.put(10, "JAVA");
        languageMap.put(20, "C++");
        languageMap.put(30, "KOTLIN");

        // for 문을 이용한 데이터 순회
        for (String language : languageMap.values()) {
            System.out.println(language);
        }
    }

}
