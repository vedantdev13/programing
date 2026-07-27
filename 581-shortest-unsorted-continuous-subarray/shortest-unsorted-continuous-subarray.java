class Solution {
    public int findUnsortedSubarray(int[] nums) {


        int[] arr = Arrays.copyOf(nums , nums.length );  // new array banaya , given wale ka hi copy 

        Arrays.sort(arr); // new arr ko sort kia and ab dono ko com[pare karna h bas 

        int low = 0 ; 
        int high = nums.length - 1 ;

        while( low < nums.length && nums[low]  ==  arr[low] ){
            low++ ;  // left aage bada (no miss match )
        }  

        while( high >= 0 && nums[high] == arr[high]){
            high-- ; // right piche la (no miss match )
        }

        if(low == nums.length ) return 0;

        // miss match mila tho length return 
        return high - low + 1;

    }
}


/**

📊 Ek Chote Se Example Se Samjho (Dry Run)Man lo nums = [2, 6, 4, 8]Tumne ise copy karke sort kiya, toh arr = [2, 4, 6, 8] ban gaya.Left Loop Chalaya:Index 0: nums[0] is 2, arr[0] is 2. Dono barabar hain (2 == 2). left badh kar 1 ho gaya.Index 1: nums[1] is 6, arr[1] is 4. Mismatch mil gaya! (6 != 4). Loop ruk gaya. left = 1.Right Loop Chalaya (Peeche Se):Index 3: nums[3] is 8, arr[3] is 8. Dono barabar hain (8 == 8). right ghat kar 2 ho gya.Index 2: nums[2] is 4, arr[2] is 6. Mismatch mil gaya! (4 != 6). Loop ruk gaya. right = 2.Final Return Calculation:Ab hume pata chal gaya ki index 1 se lekar index 2 tak ka part kharab hai (yaani [6, 4]).left = 1right = 2Return: right - left + 1 \(\rightarrow \) 2 - 1 + 1 = 2.

 */