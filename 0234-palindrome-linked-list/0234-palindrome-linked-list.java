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
        if(head == null || head .next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        while (fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfHead = reverseList(slow);

        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfHead;
        while(secondHalf !=null){
            if(firstHalf.val!= secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
    return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}