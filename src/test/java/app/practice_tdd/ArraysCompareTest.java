package app.practice_tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysCompareTest {

    @Test
    public void ArraySortRandom_Test() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void ArraySortNullArray_Test() {

        assertThrows(NullPointerException.class, () -> {
            int[] numbers = null;
            Arrays.sort(numbers);
        });
        // 예측 되는 에러.class -> catch -> throw
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.MILLISECONDS)
    public void testSort_performance() {
        int array[] = {12, 23, 4};
        for(int i = 1; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
