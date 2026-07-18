class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int n = magazine.length() ;
        int m = ransomNote.length() ;

        if(magazine.length() < ransomNote.length()){
            return false;
        }

        HashMap<Character , Integer> ved = new HashMap<>();
        HashMap<Character , Integer> ved2 = new HashMap<>();

        for(int i=0 ; i < n ; i++){
            ved.put(magazine.charAt(i),ved.getOrDefault(magazine.charAt(i), 0) + 1);     
        }
        for(int i=0 ; i < m; i++){
            ved2.put(ransomNote.charAt(i), ved2.getOrDefault(ransomNote.charAt(i), 0) + 1);        
        }
        
        for(char ch : ved2.keySet()){
            if(ved.getOrDefault(ch,0) < ved2.get(ch)){
                return false;
            }
        }
        return true;
    }
}