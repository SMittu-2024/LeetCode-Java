/** Program to check the array is sorted or not
 * E.g. int[] arr1 = {1,2,3,4,5};  
        int[] arr2 = {7,8,4,5};
 * Output for arr1: Array is sorted
 * Output for arr2: Array is not sorted
*/

class CheckArrayIsSorted {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};  
        int[] arr2={7,8,4,5};
        
        boolean isSorted = true;
        for(int i=0; i< arr2.length-1; i++){
            if(arr2[i]>arr2[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
