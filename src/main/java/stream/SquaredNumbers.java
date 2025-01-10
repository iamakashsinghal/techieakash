package stream;
import java.util.Arrays;
import java.util.List;

public class SquaredNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}
