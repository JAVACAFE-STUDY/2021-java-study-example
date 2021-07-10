package com.example.lambda.sample02;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class MethodReference {

    @Test
    public void methodExpression() {
        // 문자열을 숫자로 변환:: parseInt 사용

        Function<String, Integer> parse = new Function<>() {
            @Override
            public Integer apply(String str) {
                return Integer.parseInt(str);
            }
        };

        System.out.println(parse.apply("3"));
    }

}
