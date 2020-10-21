package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);
        OptionalDouble averageOfList = IntStream.range(0, numbers.length)
                .mapToDouble(index -> numbers[index])
                .average();
        double averageOfListAsDouble = averageOfList.getAsDouble();
        return averageOfListAsDouble;
    }
}


