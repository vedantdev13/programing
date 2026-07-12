class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> ved = new HashSet<>();
        for(int i =0 ; i < nums.length ; i++){
            ved.add(nums[i]);
        }
        List<Integer> res = new LinkedList<>(); 

        for(int i = 1 ; i <= nums.length ; i++){
            if(!ved.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}