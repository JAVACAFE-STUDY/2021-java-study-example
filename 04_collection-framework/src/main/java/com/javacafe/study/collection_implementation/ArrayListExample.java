package com.javacafe.study.collection_implementation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> simpleList = new ArrayList<>();
        // 내부 배열은 어떻게??

        // ArrayList -> 496
        simpleList.add("test1");
        simpleList.add("test2");
        simpleList.add("test3");
        simpleList.add("test4");
        simpleList.add("test5");
        simpleList.add("test6");
        simpleList.add("test7");
        simpleList.add("test8");
        // 디버깅
        simpleList.add("test9");
        simpleList.add("test10");
        simpleList.add("test11");
        simpleList.add("test12");

        // 특정 인덱스 값 추가
        simpleList.add(3, "test12");


        // 삭제하는 경우
        simpleList.remove(2);
    }
}
