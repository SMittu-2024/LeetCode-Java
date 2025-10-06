// Find Numbers Starting with 1
// E.g.List[Integer] numbers = Arrays.asList(11, 13, 14, 24, 30);
// Output: 11, 13, 14

import java.util.*;
import java.util.stream.*;
class NumbersStartingWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 13, 14, 24, 30);
        System.out.println("Elements in list are: " + numbers);
        Set<Integer> startingWithOne = numbers.stream().filter(number -> String.valueOf(number).toString().startsWith("1"))
            .collect(Collectors.toSet()); 
        System.out.println("Duplicate Elements in given list are: " + startingWithOne);
    }
}
