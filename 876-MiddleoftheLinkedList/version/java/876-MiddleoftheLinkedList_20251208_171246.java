// Last updated: 12/8/2025, 5:12:46 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode middleNode(ListNode head) {
13        ListNode dummy = head;
14        ListNode pt1 = dummy;
15        ListNode pt2 = dummy;
16        if(head.next == null) return head;
17        if(head.next.next == null) return head.next;
18        while(pt2 != null && pt2.next != null){
19            pt1 = pt1.next;
20            pt2 = pt2.next.next;
21        }
22        return pt1;
23    }
24}