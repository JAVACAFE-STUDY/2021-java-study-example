package com.example.lambda.sample03;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyEvaluation {

    @Test
    public void lazyEval(){
        List<Integer> collect = IntStream.range(0, 1000000).boxed()
                .filter(i -> i % 3 == 0)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
