// Last updated: 10/30/2025, 11:45:17 PM
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
if (list1 == null && list2 == null) return null;
if (list1 == null) return list2;
if (list2 == null) return list1;

            ListNode pt1 = list1;
            ListNode pt2 = list2;
            ListNode ll;
            ListNode head;
        

                if(pt1.val > pt2.val){
                    ll = new ListNode(pt2.val);
                    pt2 = pt2.next;
                
                }
                else{
                    ll = new ListNode(pt1.val);
                    pt1 = pt1.next;
                }
            head = ll;
            while(pt1 != null && pt2 != null){
                if(pt1.val == pt2.val){
                    ListNode newnode = new ListNode(pt1.val);
                    ll.next = newnode;
                    pt1 = pt1.next;
                    ll = ll.next;
                }
                else if(pt1.val > pt2.val){
                    ListNode newnode = new ListNode(pt2.val);
                    ll.next = newnode;
                    pt2 = pt2.next;
                    ll = ll.next;
                }
                else{
                    ListNode newnode = new ListNode(pt1.val);
                    ll.next = newnode;
                    pt1 = pt1.next;
                    ll = ll.next;
                }
            }   
while (pt1 != null) {
    ll.next = new ListNode(pt1.val);
    ll = ll.next;
    pt1 = pt1.next;
}

while (pt2 != null) {
    ll.next = new ListNode(pt2.val);
    ll = ll.next;
    pt2 = pt2.next;
}


        return head;
    }
}