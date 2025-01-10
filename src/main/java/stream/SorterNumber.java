package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SorterNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,1,3,5,7,6);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}
