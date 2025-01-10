package stream;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = factorialNumber(number);
        System.out.println("factorial Number -- "+ result);
    }

    public static int factorialNumber(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number * factorialNumber(number - 1);
    }
}
