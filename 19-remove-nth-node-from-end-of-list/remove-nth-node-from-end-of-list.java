/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len =0; 
        ListNode temp = head ; 

        while(temp != null){
            len++;
            temp = temp.next ;
        } 

        // agar head delete karna ho
        if(len == n){
            return head.next;
        }


        temp = head ;

        // piche se traverse 
        for(int i = 0 ; i < len - n - 1  ; i++ ){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;  // delet

        return head; 
    }
}

// len nikal lo ,, traverse karo piche se and har baar count +1 karo , jab count == n ho jayega tho , uss node ko remove kar do and return 

// issues in my 1st approach = singly LL me piche se traverse ni hota therefore !! len - n - 1 ( ye hai , n = len - n waala position dleet krna h )
