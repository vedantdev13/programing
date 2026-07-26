class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        // Base States initialization
        int noDel = arr[0]; 
        int oneDel = 0; // Index 0 par delete nahi kar sakte kyuki subarray non-empty hona chahiye
        int maxSoFar = arr[0];
        
        for (int i = 1; i < n; i++) {
            // dhyaan do: oneDel ki purani value calculation me use ho rahi hai, 
            // isiliye order bohot important hai!
            oneDel = Math.max(noDel, oneDel + arr[i]);
            noDel = Math.max(arr[i], noDel + arr[i]);
            
            // Har step par maximum track karo
            maxSoFar = Math.max(maxSoFar, Math.max(noDel, oneDel));
        }
        
        return maxSoFar;
    }
}
