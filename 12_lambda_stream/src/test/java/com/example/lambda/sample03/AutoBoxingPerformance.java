package com.example.lambda.sample03;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AutoBoxingPerformance {
    private static final int NUMBER_OF_RANDOM_NUMBERS = 6_000_000;
    private static List<Integer> input = generateRandomNumbers(0, Integer.MAX_VALUE - 1, NUMBER_OF_RANDOM_NUMBERS);

    public static List<Integer> testSerialWithAutoboxing() {
        long startTime = System.currentTimeMillis();
        List<Integer> collect = input.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println((System.currentTimeMillis() - startTime) + "ms");

        return collect;
    }

    public static List<Integer> testSerial() {
        long startTime = System.currentTimeMillis();
        List<Integer> collect = input.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());


        System.out.println((System.currentTimeMillis() - startTime) + "ms");

        return collect;
    }

    @Test
    public void testPerf() {
        IntStream.range(0, 5)
                .forEach(idx ->/*testSerialWithAutoboxing()*/testSerial());


    }

    public static List<Integer> generateRandomNumbers(int min, int max, int limit) {
        Random random = new Random();
        return random.ints(min, max + 1).limit(limit).boxed().collect(Collectors.toList());
    }
}
