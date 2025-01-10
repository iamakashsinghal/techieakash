package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbersWithoutDuplicates = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        List<Integer> uniqueNumbers = numbersWithoutDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
