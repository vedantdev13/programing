class Solution {
    public String smallestPalindrome(String s) {
        
        // 1. len nikal 
        int len = s.length();

        // 2. partition point or MID nial 
        int partition = len / 2 ; 

        // 3. ab new char type arrray me s k sare chars daal and sort kar left side 
        char[] chars = s.toCharArray();

        // 4. now left side sorting (ab tho char array ban gya so direct ho jayega)
        Arrays.sort(chars , 0 , partition );

        // 5.  ab for loop se right side ko left side ka mirror banade 
        for(int i =0 ; i < partition ; i++){
            chars[ len - 1 - i ]  =  chars[i] ;  // mirroring (making palindorm)
        }

        // 6. return 
        return new String(chars);
    }
}