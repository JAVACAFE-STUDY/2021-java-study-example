package com.javacafe.study.collection_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetApiMore {
    public static void main(String[] args) {
        setApiMoreExample01();
    }

    public static void setApiMoreExample01() {
        // 자바 8 이하
        new HashSet(Arrays.asList("JAVA", "KOTLIN", "C++"));

        // 자바 9 이상
        Set.of("JAVA", "KOTLIN", "C++");

        // stream 이용
        Stream.of("JAVA", "KOTLINT").collect(Collectors.toSet());
    }
}
