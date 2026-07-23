class Solution {
    public int findMin(int[] nums) {

        int max = 2147483647 ;

        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] < max ){
                max = nums[i];
            }
        }
        return max;
    }
}