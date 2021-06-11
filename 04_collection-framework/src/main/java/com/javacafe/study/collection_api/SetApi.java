package com.javacafe.study.collection_api;

import java.util.HashSet;
import java.util.Set;

public class SetApi {
    public static void main(String[] args) {
        setApiExample01();
        setApiExample02();
        setApiExample03();
        setApiExample04();
        setApiExample05();
    }

    public static void setApiExample01() {
        Set<String> languageSet = new HashSet<>();
        languageSet.add("KOTLIN");
        languageSet.add("JAVA");
        languageSet.add("C++");

        // 내부 데이터 확인하기
        System.out.println(languageSet);

        // 리스트 사이즈 조회하기
        int size = languageSet.size();
        System.out.println("Size of set:" + size);

        System.out.println("Is JAVA exist: "  + languageSet.contains("JAVA"));
    }


    public static void setApiExample02() {
        Set<String> languageSet = new HashSet<>();
        languageSet.add("JAVA");
        languageSet.add("JAVA");
        languageSet.add("JAVA");
        languageSet.add("C++");
        languageSet.add("C++");
        languageSet.add("KOTLIN");
        languageSet.add("KOTLIN");
        languageSet.add("KOTLIN");

        // 내부 데이터 확인하기
        // 중복 허용 안함
        System.out.println(languageSet);

        // 리스트 사이즈 조회하기
        int size = languageSet.size();
        System.out.println("Size of set:" + size);
    }

    public static void setApiExample03() {
        Set<String> languageSet = new HashSet<>();
        languageSet.add("JAVA");
        languageSet.add("C++");
        languageSet.add("KOTLIN");

        languageSet.remove("JAVA");
        // 삭제 결과 확인
        System.out.println(languageSet);
    }

    public static void setApiExample04() {
        Set<String> languageSet = new HashSet<>();
        languageSet.add("JAVA");
        languageSet.add("C++");
        languageSet.add("KOTLIN");

        languageSet.clear();
        // 전부 삭제!
        System.out.println("Set after calling clear() method:" + languageSet);
    }

    public static void setApiExample05() {
        Set<String> languageSet = new HashSet<>();

        // 요소 추가하기
        languageSet.add("JAVA");
        languageSet.add("C++");
        languageSet.add("KOTLIN");

        // for 문을 이용한 데이터 순회
        for (String language : languageSet) {
            System.out.println(language);
        }
    }

}
