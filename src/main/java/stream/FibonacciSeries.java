package stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        printFibonacciSeries(number);
    }

    public static void printFibonacciSeries(int number){
        if(number <= 0){
            System.out.println("Please enter positive number");
        }
        int first = 0, second = 1;
        for(int i = 1; i <= number; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
