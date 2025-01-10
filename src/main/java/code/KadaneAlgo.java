package code;

public class KadaneAlgo {
    // find Maximum Number Of Subarray
    public static int findMaximumNumberOfSubarray(int [] number){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnding = 0;
        for(int num  : number){
            maxEnding = Math.max(num, maxEnding + num);
            maxSoFar = Math.max(maxEnding, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int number [] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaximumNumberOfSubarray(number));
    }

    //Output - 6,  Complexity: Time: O(n), Space: O(1)
}
