package StreamApiAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = number.stream().filter( n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers List - " + evenNumbers);

        List<String> words = Arrays.asList("Java", "Word", "Akash", "Shiv", "Waiting");
        List<String> filtersWord = words.stream().filter(word -> words.toArray().length > 3).collect(Collectors.toList());
        System.out.println("Filters Word List - " + filtersWord);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Akash", 50000));
        employeeList.add(new Employee("Akash", 30000));
        employeeList.add(new Employee("Ashu", 140000));
        employeeList.add(new Employee("Shiv", 200000));
        employeeList.add(new Employee("Rajesh", 10000));
        List<Employee> employeeListSorted = employeeList.stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());

        System.out.println("Greater than - "+ employeeListSorted);
    }
}
