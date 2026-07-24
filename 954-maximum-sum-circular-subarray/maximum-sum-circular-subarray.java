class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int currMax = nums[0];
        int maxSum = nums[0];
        
        // Circular sum track karne ke liye minimum variables
        int currMin = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            totalSum += num; 

            // Aapka Max Kadane logic
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);
            
            // Min Kadane logic
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }
        
        // Edge Case: Agar saare numbers negative hain
        if (maxSum < 0) {
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
}
