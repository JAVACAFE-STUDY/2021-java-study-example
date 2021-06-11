package com.javacafe.study.collection_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

// 아래와 같이 정수값이 저장된 리스트가 있다.
// 각 정수들이 몇개가 존재하는지를 찾고 출력해보자 (Map을 이용해보자)
// [1,2,1,4,2,1] ::  1=>3개, 2=>2개 4=>1개
public class CollectionApiExercise02 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList(asList(9, 7, 1, 8, 2, 1, 18, 11, 1, 4, 2, 9, 21, 18));
    }
}
