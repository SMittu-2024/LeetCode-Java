// Sort List in Descending Order
// List<Integer> numbers = Arrays.asList(10, 5, 20, 15);
import java.util.*;
import java.util.stream.*;
class ReverseListElements {
    public static void main(String[] args) {
          List<Integer> numbers = Arrays.asList(10, 5, 20, 15);
          System.out.println("Original list elements are:" + numbers);
          
          List<Integer> reversed = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
          System.out.println("List elements in reverse order are:" + reversed);
    }
}
