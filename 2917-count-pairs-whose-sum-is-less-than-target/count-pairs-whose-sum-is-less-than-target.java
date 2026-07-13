class Solution {
    public int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);
        int i =0 ;
        int j = nums.size() - 1; 
        int count =0;
        while( i < j ){
            int sum = nums.get(i) + nums.get(j);

            if(sum < target ){
                count = count + (j - i) ; // vo 0 - 4 wala example 
                i++;
            }
            else{
                j--;
            }
        } 
        return count ;
    }
}


/**
basic O(n2)

        int ans =0;
        for(int i =0 ; i < nums.size() ; i++){
            for(int j = i + 1 ; j < nums.size() ; j++){
                int sum = nums.get(i) + nums.get(j);

                if(sum < target){
                    ans++;
                }
            }
        }
        return ans ;

 */