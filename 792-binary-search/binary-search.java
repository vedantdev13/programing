class Solution {
    public int search(int[] nums, int target) {
        
        // O( log n )  solution !!!  - ninary search 

        int low =0 ; 
        int high = nums.length - 1 ;

        while( low <= high ){

            int mid = low + (high - low) / 2 ;

            // case 1
            if( nums[mid] == target ){
                return mid;
            }

            //case 2
            else if( nums[mid] < target){
                low = mid+1;
            }

            //case 3 
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}

/**
        O(n) solution !!

        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;

 */