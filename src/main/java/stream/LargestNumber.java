package stream;

public class LargestNumber {
    public static void main(String[] args) {
        int [] numbers = {3, 7, 2, 8, 10, 4, 1};
        System.out.println("Find Largest Number - "+findLargestNo(numbers));
    }

    public static int findLargestNo(int [] array){
        int largest = array[0];
        for(int num : array){
            if(num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}
