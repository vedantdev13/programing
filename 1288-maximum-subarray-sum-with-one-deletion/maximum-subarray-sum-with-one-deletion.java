class Solution {
    public int maximumSum(int[] arr) {

        // noDel = Maximum sum ending at current index
        //          WITHOUT using deletion.
        int noDel = arr[0];

        // oneDel = Maximum sum ending at current index
        //          AFTER using exactly one deletion.
        // Pehle element pe delete nahi kar sakte,
        // isliye 0 se start kar rahe hain.
        int oneDel = 0;

        // Final answer
        int ans = arr[0];

        // 2nd element se loop start
        for (int i = 1; i < arr.length; i++) {

            // Purana noDel save kar lo.
            // Kyuki neeche noDel update hone wala hai.
            int oldNoDel = noDel;

            // ==========================
            // ONE DELETION STATE
            // ==========================

            // Option 1:
            // Delete pehle hi use kar chuke the,
            // ab current element add karo.
            //
            // oneDel + arr[i]
            //
            // Example:
            // 5 X 6
            // current = 6
            // => 5 + 6

            // Option 2:
            // Current element ko hi delete kar do.
            //
            // oldNoDel
            //
            // Example:
            // 5 -100
            // Delete -100
            // Sum = 5

            oneDel = Math.max(oneDel + arr[i], oldNoDel);

            // ==========================
            // NO DELETION STATE
            // ==========================

            // Normal Kadane
            //
            // Option 1:
            // Naya subarray start karo
            //
            // arr[i]
            //
            // Option 2:
            // Pichla continue karo
            //
            // oldNoDel + arr[i]

            noDel = Math.max(arr[i], oldNoDel + arr[i]);

            // Final answer update
            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return ans;
    }
}