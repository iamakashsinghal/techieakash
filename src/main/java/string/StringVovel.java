package string;

public class StringVovel {

    public static void main(String[] args) {
        System.out.println(vovelString("Akash"));
        System.out.println(vovelString("fly"));
    }

    public static boolean vovelString(String value) {
         if(value == null)
             throw new IllegalArgumentException("Enter value null can be contains.");

        return value.toLowerCase().matches(".*[aeiou].*");
    }
}
