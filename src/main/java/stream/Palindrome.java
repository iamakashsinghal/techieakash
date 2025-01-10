package stream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abc";
        if(str == null || str.isEmpty()){
            System.out.println("Enter the value");
        }else if(isPalindromeCheck(str)){
            System.out.println(str+" is Palindrome");
        } else {
            System.out.println(str+" is not Palindrome");
        }
    }
    public static boolean isPalindromeCheck(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
