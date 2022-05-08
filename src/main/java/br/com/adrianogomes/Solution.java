package br.com.adrianogomes;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Objects.nonNull;

public class Solution {

    public static int solution(int[] numbers) {
        AtomicInteger smallestNumber = new AtomicInteger(1);

        if (nonNull(numbers)) {
            Arrays.stream(numbers)
                    .sorted()
                    .filter(n -> n > 0)
                    .forEach(n -> {
                        boolean b = Arrays.stream(numbers).anyMatch(n1 -> n1 == smallestNumber.get());
                        if (b) smallestNumber.getAndIncrement();

                    });
        }
        return smallestNumber.get();
    }
}
