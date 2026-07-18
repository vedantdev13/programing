class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character , Integer> ved = new HashMap<>();
        for(int i =0; i < s.length() ; i++){
            char ch = s.charAt(i);

            ved.put(ch,ved.getOrDefault(ch , 0)+1);
        }
        for(int i =0; i < s.length() ; i++){
            if(ved.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }
}

/**

                HashMap<Character , Integer> ved = new HashMap<>();

        // step 1
        for(int i =0 ; i < s.length() ; i++){

            if(ved.containsKey(s.charAt(i) ) ){

                ved.put(s.charAt(i) , ved.get(s.charAt(i)) + 1 );
            }

            else{
                ved.put(s.charAt(i) , 1);
            }
        }

        // step 2
        for(int i =0 ; i < s.length() ; i++){
            if(ved.get(s.charAt(i)) == 1){
                return i ;
            }

        }
        return -1;







        for(int i =0 ; i < s.length() ; i++){

            int count = 0 ;

            for(int j = 0 ;  j < s.length() ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            // ineer loop k bahar 
            if(count == 1){
                return i;
            }
        }
        return -1;
        
 */