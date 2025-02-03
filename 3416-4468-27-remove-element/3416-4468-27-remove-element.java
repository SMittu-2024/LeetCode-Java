class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==val){
                count++;
            }
        }
        int[] temp = new int[nums.length-count];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                temp[k++]=nums[i];
            }
        }        
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        return nums.length-count;
    }
}