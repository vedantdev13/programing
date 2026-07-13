class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;                     // Left Pointer
        int j = numbers.length - 1;    // Right Pointer

        while (i < j) {

            int currSum = numbers[i] + numbers[j];

            // Pair mil gaya
            if (currSum == target) {
                return new int[]{i + 1, j + 1};
            }

            // Sum chhota hai -> Sum badhana hai
            else if (currSum < target) {
                i++;
            }

            // Sum bada hai -> Sum kam karna hai
            else {
                j--;
            }
        }

        return new int[]{-1, -1}; // Problem guarantee karta hai ki answer milega
    }
}