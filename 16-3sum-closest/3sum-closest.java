class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closestSum = nums[0] + nums[1] + nums[2];  // start me maan lo to compare later 

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k]; 

                    if(sum == target ){
                        return sum ;
                    }

                    if(Math.abs(target - sum ) < Math.abs(target - closestSum)){  // sum and closestSum ko target se compare 
                        closestSum = sum ; 
                    }
                }
            }
        }
        return closestSum ;
    }
}