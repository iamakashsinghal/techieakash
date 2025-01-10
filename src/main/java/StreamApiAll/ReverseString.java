package StreamApiAll;

public class ReverseString {
    public static void main(String[] args) {
        // Input string
        String input = "Hello World";

        // Reverse the string
        String reversed = reverseString(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Convert the string into a character array
        char[] charArray = str.toCharArray();

        // Use two pointers to reverse the array in place
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap the characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}