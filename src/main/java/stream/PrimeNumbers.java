package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream(). // Stream api to filter Prime and print them
                filter(n -> n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0)).
                forEach(System.out::println); // Prime each prime number
    }
}
