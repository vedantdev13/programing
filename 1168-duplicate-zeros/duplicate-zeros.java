class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] ved = new int[n];
        int j = 0; // Pointer for the new array
        
        for (int i = 0; i < n && j < n; i++) {
            if (arr[i] != 0) {
                ved[j] = arr[i];
                j++;
            } else {
                ved[j] = 0;
                if (j + 1 < n) {
                    ved[j + 1] = 0;
                }
                j += 2;
            }
        }
        
        // Copy the results back into the original array
        for (int i = 0; i < n; i++) {
            arr[i] = ved[i];
        }
    }
}
