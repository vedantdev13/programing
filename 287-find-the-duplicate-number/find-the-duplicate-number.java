class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> ved = new HashSet<>();
        for(int i =0 ; i < nums.length ; i++){
            if(!ved.contains(nums[i])){
                ved.add(nums[i]);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}




/*



        // to remove TLE we use hashset 
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                return num;
            }
        }
        return -1;




I WROTE THIS CODE FULLY BY MY SELF ( bas TLE aa gya ) 

        for(int i =0; i< nums.length ; i++){
            for(int j = i +1 ; j< nums.length ; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }

            }
        }
        return -1;


*/