/** Program to find common elements in two array without using Collections
 * E.g. int[] arr1={1,2,3,4,5};  
        int[] arr2={7,8,4,5};
 * Output: [4, 5]
*/

class CommonElementsInArraysWithoutCollection {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};  
        int[] arr2={7,8,4,5};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        System.out.println("Common elements in two arrays  are: " );
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            } else if(arr1[i]<arr2[j]){
                i++;
            } else{
                j++;
            }
        }
    }
}
