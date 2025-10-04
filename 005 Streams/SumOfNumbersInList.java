import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        long sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum of numbers is: " + sum);
    }
}
