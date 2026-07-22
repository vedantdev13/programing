class Solution {
    public int findMaxLength(int[] nums) {

        // count -> first index store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        // Array start hone se pehle count = 0 tha
        map.put(0, -1);

        int count = 0;   // 1 ke liye +1, 0 ke liye -1
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            // 1 mila to count badhao
            // 0 mila to count ghatao
            if (nums[i] == 1) {
                count++;
            } else {
                count--;
            }

            // Agar ye count pehle bhi mila tha
            if (map.containsKey(count)) {

                // Current index - First occurrence
                // = Equal 0 & 1 wala subarray
                maxLen = Math.max(maxLen, i - map.get(count));

            } else {

                // Count pehli baar mila
                // Iska index store kar do
                map.put(count, i);
            }
        }

        return maxLen;
    }
}