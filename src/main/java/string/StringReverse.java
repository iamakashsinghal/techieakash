package string;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString(null));
    }

    public static String reverseString(String value) {
        if (value == null)
            throw new IllegalArgumentException("Null is not valid input");
        StringBuilder builder = new StringBuilder();
        char [] valueArray = value.toCharArray();
        for(int i  = valueArray.length - 1; i >= 0; i--){
            builder.append(valueArray[i]);
        }
        return builder.toString();
    }
}
