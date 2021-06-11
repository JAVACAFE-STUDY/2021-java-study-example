package com.javacafe.study.collection_api;

import java.util.*;

import static java.util.Arrays.asList;

// 정수 값이 저장된 리스트에서 중복값을 제거 후 오름차순으로 정렬하여 출력하시오
// [5,2,7,1,2,1] 인 경우 [1,2,5,7]로 출력
public class CollectionApiExercise01 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList(asList(9, 7, 1, 8, 2, 1, 23, 4, 11, 1, 8, 2, 6, 21, 18));
    }
}
