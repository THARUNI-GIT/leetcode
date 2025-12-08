// Last updated: 12/8/2025, 5:40:57 PM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode pt1 = dummy;
8        ListNode pt2 = dummy;
9
10        for(int i = 0; i < n; i++){
11            pt2 = pt2.next;
12        }
13
14        while(pt2.next != null){
15            pt1 = pt1.next;
16            pt2 = pt2.next;
17        }
18
19        pt1.next = pt1.next.next;
20
21        return dummy.next;
22    }
23}
24