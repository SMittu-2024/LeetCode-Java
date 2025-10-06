// Find Duplicate Elements
// E.g.List[Integer] numbers = Arrays.asList(11, 13, 14, 14, 10, 13, 18);
// Output: 13, 14

import java.util.*;
import java.util.stream.*;
class DuplicateElementsUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 13, 14, 14, 10, 13, 18);
        System.out.println("Elements in list are: " + numbers);
        Set<Integer> duplicates;
        Set<Integer> uniques = new HashSet<>();
        duplicates = numbers.stream().filter(number -> !uniques.add(number)).collect(Collectors.toSet()); 
        System.out.println("Duplicate Elements in given list are: " + duplicates);
    }
}
