class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length;i++){
            //if target is found in the array 
            if(nums[i]==target)
                return i;
            //if target is less than array element
            else if(nums[i]>target)
                return i;
        }
        //if array element smaller than target not found in array
        return i;
    }
}
