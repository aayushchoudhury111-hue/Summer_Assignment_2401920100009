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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode b = rev(a);
        ListNode temp = head;
        while(b!=null){
            if(temp.val!=b.val){
                return false;
            }
            temp=temp.next;
            b=b.next;
        }
        return true;
    }
    public static ListNode rev(ListNode head){
        ListNode curr = head;
        ListNode frwd;
        ListNode prev = null;
        while(curr!=null){
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        return prev;
    }
}