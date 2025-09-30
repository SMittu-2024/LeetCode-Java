class Solution {
     public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7};
       
        System.out.println("Array elements after removing duplicates are:" );
         
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        for(int i=0; i<j; i++)
            System.out.println(nums[i]);
    }
}
    
