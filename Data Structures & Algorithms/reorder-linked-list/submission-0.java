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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode curr = head;
        int cnt = 0;
        while(curr != null){
            curr = curr.next;
            cnt++;
        }
        ListNode mid = head;
        for(int i = 0; i < (cnt + 1) / 2; i++){
            mid = mid.next;
        }

        ListNode fst = head;
        while(fst.next != mid){
            fst = fst.next;
        }
        fst.next = null;

        ListNode scnd = mid;
        curr = scnd;
        ListNode next = null, prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        fst = head;
        scnd = prev;
        while(fst != null && scnd != null){
            ListNode temp1 = fst.next;
            ListNode temp2 = scnd.next;
            fst.next = scnd;
            scnd.next = temp1;
            fst = temp1;
            scnd = temp2;
        }
    }
}
