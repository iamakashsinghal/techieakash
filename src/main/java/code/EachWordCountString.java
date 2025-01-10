package code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EachWordCountString {

    // Each character Count String logic stream api
    public static Map<String, Long> eachCharacter(String workCount){
        return Arrays.stream(workCount.split("")).map(String :: toLowerCase).collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));

        // or you can also try using Function.identify() instead of LinkedHashMap

//        Map<String, Long> mapObject = Arrays.stream(workCount.split(""))
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        return mapObject;

    }

    // Each Word Count String logic stream api
    public static Map<String, Long> wordCount(String workCount){
        return Arrays.stream(workCount.split(" ")).map(String :: toLowerCase).collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
    }

    public static void main(String[] args) {
        String workCount = "This is Akash singhal i am the best developer i am true akash";
        System.out.println(eachCharacter(workCount));
    }
}
