package com.example.lambda.sample01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    @Test
    public void numberToColonJoinString() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        final int size = numbers.size();
        StringBuilder stringBuilder = new StringBuilder();

        for (int idx = 0; idx < size; idx++) {
            stringBuilder.append(numbers.get(idx).toString());
            if (idx != size - 1) {
                stringBuilder.append(" : ");
            }
        }

        System.out.println(stringBuilder);
    }

    @Test
    public void numberToColonJoinString2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        String colonToString = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" : "));

        System.out.println(colonToString);
    }
}
