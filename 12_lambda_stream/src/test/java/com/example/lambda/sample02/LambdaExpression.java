package com.example.lambda.sample02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExpression {
    @Test
    public void lambdaExpression() {
        Function<Integer, Integer> square = new Function<>() {
            @Override
            public Integer apply(Integer num) {
                return num * num;
            }
        };

        System.out.println(square.apply(3));
    }
}
