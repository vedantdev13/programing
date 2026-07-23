class Solution {
    public int findMin(int[] nums) {

        // O( log n ) solution !!!!!

        int low = 0 ; 
        int high = nums.length - 1;

        while( low < high ){  // strictlyy '<' ayega 

            int mid = low + (high - low ) / 2 ;

            // case 1 
            if( nums[mid] < nums[high] ){
                high = mid  ;
            }
            else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}

/**

    O(n) solution !!!
    
    int max = 2147483647 ;

    for(int i =0 ; i < nums.length ; i++){
        if(nums[i] < max ){
            max = nums[i];
        }
    }
    return max;


 */