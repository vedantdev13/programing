// my approahc heap me frequency k sath store karlo har String and then top k wali return 

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        // Step 1 : Frequency Count
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        // Step 2 : Max Heap
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {

            // Agar frequency same hai
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }

            // Frequency zyada wale ko pehle rakho
            return map.get(b) - map.get(a);
        });

        // Step 3 : HashMap ki keys ko array me convert karo
        String[] keys = map.keySet().toArray(new String[0]);

        // Ab simple for loop
        for (int i = 0; i < keys.length; i++) {
            pq.add(keys[i]);
        }

        // Step 4 : Answer
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}