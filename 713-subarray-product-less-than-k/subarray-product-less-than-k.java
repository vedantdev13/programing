class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;

        int totalCount = 0;
        int product = 1; // Product ko loop ke baahar initialize kiya taaki baar-baar reset na ho
        int left = 0;    // 'left' pointer ko variable banaya, loop nahi

        // CHANGE 1: Ab sirf ek loop hai jo 'right' pointer ko control karta hai
        for (int right = 0; right < nums.length; right++) {

            product = product * nums[right]; // Window expand ki: right element ko product mein add kiya

            // CHANGE 2: Jab tak product >= k hai, tab tak left se window ko chhota karo
            // Yahan humne aapka logic rakha hai, bas 'left++' safely loop ke andar chalega
            while (product >= k && left <= right) {
                product /= nums[left]; // Left element ko product se hataya
                left++;                // Left pointer ko aage badhaya
            }

            // CHANGE 3: right - left + 1 current window ke saare valid subarrays ko count karta hai
            totalCount += right - left + 1; 
        }

        return totalCount;
    }
}
