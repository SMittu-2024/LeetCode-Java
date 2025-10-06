// Count occurrences of each word in a sentence.
// E.g. String str = "java is fun and java is powerful";
// Output: java=2, powerful=1, and=1, is=2, fun=1

import java.util.*;
import java.util.stream.*;
class WordCountUsingStreams {
    public static void main(String[] args) {
        String str = "java is fun and java is powerful";
        System.out.println("The given string is: " + str);
        String[] arr = str.split(" ");
        Map<String, Long> occurences = Arrays.stream(arr).collect(Collectors.groupingBy(word -> word, Collectors.counting())); // Group and count
        System.out.println("Occurences of each word in given sentence are: " + occurences);
    }
}
