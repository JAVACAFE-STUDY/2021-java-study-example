package com.javacafe.study.why_collection;

import java.util.ArrayList;
import java.util.List;

import static com.javacafe.study.why_collection.PrintArrayUtil.printArray;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ArrayExample01 {
    public static void main(String[] args) {
        arrayExample01();
        arrayExample02();
        arrayListExample01();
        arrayListExample02();
    }

    public static void arrayExample01() {
        String[] languages = new String[3];
        languages[0] = "JAVA";
        languages[1] = "KOTLIN";
        languages[2] = "PYTHON";

        printArray(languages);
    }

    public static void arrayExample02() {
        String[] languages = new String[]{"JAVA", "KOTLIN", "PYTHON"};
        printArray(languages);

        // 만약 새로운 데이터를 index 3번에 추가해야 한다면..?
        languages = new String[]{languages[0], languages[1], languages[2], "C++"};
        printArray(languages);

        // 만약 1번 인덱스의 데이터를 삭제해야 한다면??
        languages = new String[]{languages[0], languages[2], languages[3]};
        printArray(languages);
    }


    public static void arrayListExample01() {
        List languages = new ArrayList();
        languages.add("JAVA");
        languages.add("KOTLIN");
        languages.add("PYTHON");

        System.out.println(languages);
    }

    public static void arrayListExample02() {
        List languages = new ArrayList();
        languages.add("JAVA");
        languages.add("KOTLIN");
        languages.add("PYTHON");
        System.out.println(languages);

        languages.add("C++");
        System.out.println(languages);

        languages.remove(1);
        System.out.println(languages);
    }

}
