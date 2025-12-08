// Last updated: 12/8/2025, 5:17:43 PM
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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next == null){
14            return null;
15        }
16        ListNode dummy = head;
17        ListNode prev = new ListNode(-1);
18        ListNode pt1 = dummy;
19        ListNode pt2 = dummy;
20        while(pt2 != null && pt2.next != null){
21            prev = pt1;
22            pt1 = pt1.next;
23            pt2 = pt2.next.next;
24        }
25        prev.next = pt1.next;
26        pt1.next = null;
27        return dummy;
28
29    }
30}