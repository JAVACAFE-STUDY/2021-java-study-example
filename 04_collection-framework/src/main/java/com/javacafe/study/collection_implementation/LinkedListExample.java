package com.javacafe.study.collection_implementation;

import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings({"rawtypes", "unchecked"})
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> simpleList = new LinkedList<>();

        simpleList.add("test1");
        simpleList.add("test2");
        simpleList.add("test3");
        simpleList.add("test4");
        simpleList.add("test5");
        simpleList.add("test6");

        // 삭제하는 경우
        simpleList.remove(1);
    }
}
