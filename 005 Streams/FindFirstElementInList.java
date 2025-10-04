// Find First Element
// E.g. List<String> list = Arrays.asList("one", "two", "three", "four");
// Output: one
import java.util.*;
class FindFirstElementInList {
    public static void main(String[] args) {
          List<String> list = Arrays.asList("one", "two", "three", "four");
          System.out.println("Elements in list are:" + list);
          String first = list.stream().findFirst().get(); 
          System.out.println("First element in list is: " + first);
    }
}
