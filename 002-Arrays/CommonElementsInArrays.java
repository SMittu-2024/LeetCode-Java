/** Program to find common elements in two array using Collections
 * E.g. int[] arr1={1,2,3,4,5};  
        int[] arr2={7,8,4,5};
 * Output: [4, 5]
*/
import java.util.*;
class CommonElementsInArrays {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};  
        int[] arr2={7,8,4,5};
       
        Set<Integer> set = new HashSet<>();
        for(int num: arr1)
            set.add(num);
          
        Set<Integer> commonSet = new HashSet<>();    
        for(int num:arr2){
            if(!set.add(num))
                commonSet.add(num);
        }            
        System.out.println("Common elements in two arrays  are: " + commonSet);
    }
}
