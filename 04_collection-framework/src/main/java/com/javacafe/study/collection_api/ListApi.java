package com.javacafe.study.collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListApi {
    public static void main(String[] args) {
        listApiExample01();
        listApiExample02();
        listApiExample03();
        listApiExample04();
    }

    public static void listApiExample01() {
        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C++");
        languageList.add("KOTLIN");

        // 내부 데이터 확인하기
        System.out.println(languageList);

        // 리스트 사이즈 조회하기
        int size = languageList.size();
        System.out.println("Size of list:" + size);
    }

    public static void listApiExample02() {
        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C++");
        languageList.add("KOTLIN");

        languageList.remove(1);
        languageList.remove("JAVA");
        // 삭제 결과 확인
        System.out.println(languageList);
    }

    public static void listApiExample03() {
        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C++");
        languageList.add("KOTLIN");

        languageList.clear();
        // 전부 삭제!
        System.out.println("List after calling clear() method:" + languageList);
    }

    public static void listApiExample04() {
        List<String> languageList = new ArrayList<>();

        // 요소 추가하기
        languageList.add("JAVA");
        languageList.add("C++");
        languageList.add("KOTLIN");

        // for 문을 이용한 데이터 순회
        for (String language : languageList) {
            System.out.println(language);
        }
    }


}
