class Solution {
    public int findNumbers(int[] nums) {
        
        int ans =0 ; 

        for(int i =0 ; i < nums.length ; i++){
            int CurrentNum = nums[i];
            int count =0;


            while( CurrentNum > 0){
                count++;
                CurrentNum = CurrentNum / 10 ;
            } 

            if(count % 2 == 0){
                ans++;
            }
            else{
                count = 0;
            }
        }
        return ans ;
    }
}