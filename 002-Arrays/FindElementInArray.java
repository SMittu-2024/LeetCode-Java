/** Program to check the array is sorted or not
 * E.g. int[] arr={7,8,4,5,1,3}; 
 * Element to search: 5
 * Output: Element found at index: 3
 * Element to search: 50
 * Output: Element is not found
*/

class FindElementInArray {
    public static void main(String[] args) {

        int[] arr={7,8,4,5,1,3};
        int element = 5;
        boolean found = false;
        for(int i=0; i< arr.length; i++){
            if(element==arr[i]){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Element is not found");
    }
}
