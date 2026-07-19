// stack = LIFO
class Solution {
    public String removeDuplicates(String s) {
        // stack banaya - usme ek element dala and uske bad check kia kya next element uske jo just andar gya uske agar equal h tho dono elemet remove and same for next 
Stack<Character> ved = new Stack<>();

for (int i = 0; i < s.length(); i++) {

    char ch = s.charAt(i);

    if (ved.isEmpty()) {
        ved.push(ch);
    }
    else if (ved.peek() == ch) {
        ved.pop();
    }
    else {
        ved.push(ch);
    }
}

StringBuilder ans = new StringBuilder();

while (!ved.isEmpty()) {
    ans.append(ved.pop());
}

return ans.reverse().toString();
    }
}