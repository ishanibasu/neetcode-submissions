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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before = null;
        ListNode l = head;
        for(int i = 1; i < left; i++){
            before = l;
            l = l.next;
        }
        ListNode r = l;
        for(int i = left; i < right; i++){
            r = r.next;
        }ListNode after = r.next;
        ListNode curr = l;
        ListNode next = null, prev = after;
        while(curr != after){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(before != null){
            before.next = prev;
        }
        else{
            head = prev;
        }
        return head;
    }
}