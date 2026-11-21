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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode newLL = dummy;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                newLL.next = list1;
                list1 = list1.next;
            }
            else{
                newLL.next = list2;
                list2 = list2.next;
            }
            newLL = newLL.next;
        }
        if(list1 !=null){
            newLL.next = list1;
        }
        if(list2 != null){
            newLL.next = list2;
        }
        return dummy.next;
    }
}