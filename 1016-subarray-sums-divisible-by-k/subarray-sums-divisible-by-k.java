class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int[] freq = new int[k];
        freq[0] = 1;

        int prefixSum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int rem = prefixSum % k;

            if (rem < 0) {
                rem += k;
            }

            ans += freq[rem];

            freq[rem]++;
        }

        return ans;
    }
}


/* MY SELF BRUTE FORCR 

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int ans = 0 ; 
        for(int i =0 ; i < nums.length ; i++){

            int sum = 0 ; 
            for(int j = i ; j < nums.length ; j++){
                sum += nums[j];
                if(sum % k == 0 ){
                    ans++;
                }
            }
        }
        return ans ;
    }
}

*/