class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);

        int i = nums.length - 1 ; 

        int a = nums[i] - 1;
        int b = nums[i-1] - 1 ;

        return a*b;
    }
}