/** Program to remove duplicates from a sorted array
 * E.g. int[] arr = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7};
 * Output: [1, 2, 3, 4, 5, 6, 7]
*/
import java.util.*;
class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7};
       
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
         
        for(int num: nums)
            set.add(num);
            
        System.out.println("Array elements after removing duplicates are: " + set);
    }
}
