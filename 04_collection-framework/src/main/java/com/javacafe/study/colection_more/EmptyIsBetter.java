package com.javacafe.study.colection_more;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class EmptyIsBetter {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = null;

        a.contains("test"); // 정상처리
        b.contains("test"); // NPE

        // 비어있는지 여부 확인
        boolean isEmpty = a == null || a.isEmpty();
    }
}
