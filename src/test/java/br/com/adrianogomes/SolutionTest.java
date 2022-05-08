package br.com.adrianogomes;

import org.junit.Test;
import java.util.stream.IntStream;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void shouldReturnNumber5() {
        int[] numbers = {1, 3, 6, 4, 1, 2};
        int result = Solution.solution(numbers);
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnNumber1() {
        int[] numbers = {-1,-2};
        int result = Solution.solution(numbers);

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnNumber6() {
        int[] numbers = {1,2,3,4,5};
        int result = Solution.solution(numbers);

        assertEquals(6, result);
    }

    @Test
    public void shouldReturnNumber150999OfLangeRange() {
        int[] numbers = IntStream.rangeClosed(1, 150999).toArray();
        int result = Solution.solution(numbers);

        assertEquals(151000, result);
    }

    @Test
    public void whenEmptyListShouldReturnNumber1() {
        int[] numbers = {};
        int result = Solution.solution(numbers);

        assertEquals(1, result);
    }

    @Test
    public void whenSendNullValueShouldReturnNumber1() {
        int result = Solution.solution(null);

        assertEquals(1, result);
    }
}
