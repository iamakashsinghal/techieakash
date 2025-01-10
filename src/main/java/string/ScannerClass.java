package string;


import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        while (myInt < 0){
            System.out.println(myInt);
        }
        scanner.close();
    }
}