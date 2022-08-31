package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce((num1, num2) -> num1 % num2 == 0 ? num1 :num2)
                .get();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce((a,b) -> a.length() >= b.length() ? a : b)
                .get();
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .map(word -> word.length())
                .reduce(0, Integer::sum);
    }
}
