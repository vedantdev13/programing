class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i + 1 ;j<nums.length ; j++){    // yha [j = i+ 1] coz. j=0 kia tho i , j same index ho jayege 
                if(nums[i] + nums[j] == target){
                    return new int[] {i , j};  // return both indexes by creating new int array..
                }

            }
            
        }
        return new int[]{};
    }
}
/* think like this 
mujhe 2 index ya no . chiye array se jinka sum karne k bad target k equal aaye 
tho mujhe har possible pair check krna padega (matlab loop) 
or fir return krna pdega
*/ 