/** Sort the array elements
* Example input: {15,13,64,26,70,39}
* Expected output: {13,15,26,39,64,70}
*/

class SortArray{
    public static void main(String[] args) {
        int[] arr = {15,13,64,26,70,39};
        System.out.println("Original array is: ");
        for(int num: arr)
        System.out.println(num);
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp = arr[j+1];
                 arr[j+1] = arr[j];
                 arr[j] = temp;
                 }
             }
        }
     System.out.println("Sorted array elements are: ");
     for(int num: arr)
        System.out.println(num);
    }
}