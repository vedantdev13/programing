// isme kadaens algo. lagega coz, no need to maintain window jisko bada chota karna h 
class Solution {
    public int maxSubArray(int[] nums) {

        int Max =nums[0] ; 
        int curr =0;

        for(int i =0 ; i < nums.length ; i++){

            curr = curr + nums[i];

            Max = Math.max(curr , Max);

            if( curr < 0){
                curr = 0 ;
            } 
        }
        return Max ;
        
    }
}
// kadaen me bas = current sum and max sum compapre karna hota and add krna hota bass