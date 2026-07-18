class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> ved = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            ved.put(nums[i] , ved.getOrDefault(nums[i] , 0) +1 );

            if((ved.get(nums[i]) > 1 )){   // .get() me jo value h vo access hota h 
                return nums[i];
            }
        }
        return -1;
    }
}




/*        


        // to remove TLE we use hashset 

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