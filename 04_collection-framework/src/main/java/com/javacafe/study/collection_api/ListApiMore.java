package com.javacafe.study.collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ListApiMore {
    public static void main() {
    }

    public static void listApiMoreExample01() {
        // java 8 이하
        Arrays.asList("JAVA", "KOTLIN", "C++");

        // java 9 이상
        List.of("JAVA", "KOTLIN", "C++");

        // stream 이용
        Stream.of("AAA", "BBB", "CCC").collect(toList());
    }

    public static void listApiMoreExample02() {

    }

}
