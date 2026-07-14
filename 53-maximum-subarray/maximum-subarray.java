// isme kadaens algo. lagega coz, no need to maintain window jisko bada chota karna h 
class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0] ;  // abhi 1st elemeng ko hi maxSum maan lo 
        int currSum = 0 ;

        for(int i =0 ; i< nums.length ; i++){

            currSum += nums[i];
            
            maxSum = Math.max(currSum , maxSum );

            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSum;

        
    }
}
// kadaen me bas = current sum and max sum compapre karna hota and add krna hota bass