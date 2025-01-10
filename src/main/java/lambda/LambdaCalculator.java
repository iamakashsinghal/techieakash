package lambda;

public class LambdaCalculator {

    public static void main(String[] args) {
        FunctionalCalculator addition = (inputFirst, inputSecond) -> inputFirst + inputSecond;
        System.out.println("Addition for Two Number - " + addition.calculateValue(45, 15));

        FunctionalCalculator subtract = (inputFirst, inputSecond) -> inputFirst - inputSecond;
        System.out.println("Subtract for Two Number - "+ subtract.calculateValue(45, 15));

        FunctionalCalculator multiply = (inputFirst, inputSecond) -> inputFirst * inputSecond;
        System.out.println("Multiply for Two Number - " + multiply.calculateValue(45, 10));

        FunctionalCalculator divide =  (inputFirst, inputSecond) -> inputFirst / inputSecond;
        System.out.println("Divided for two Number - " + divide.calculateValue(45, 10));
    }
}
