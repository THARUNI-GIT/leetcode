// Last updated: 10/30/2025, 11:45:21 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     /*   ListNode dummynode = new ListNode(-1);
        ListNode dummy = dummynode;
        int carry = 0;
        while(l1 != null && l2 != null){
            int value = l1.val + l2.val+carry;
        if(value <= 9 ){
            dummynode.next = new ListNode(value);
            dummynode = dummynode.next;
            carry = 0;
        }
        else{
            dummynode.next = new ListNode(value%10);
            carry = 1;
            dummynode = dummynode.next;
        }
        l1 = l1.next;
        l2 = l2.next;
        }
        while(l1 != null){
            int value1 = l1.val + carry;
            if(value1 <= 9 ){
            dummynode.next = new ListNode(value1);
            dummynode = dummynode.next;
            carry = 0;
        }
        else{
            dummynode.next = new ListNode(value1%10);
            carry = 1;
            dummynode = dummynode.next;
        }
        l1 = l1.next;

        }
        while(l2!= null){
            int value2 = l2.val + carry;
             if(value2 <= 9 ){
            dummynode.next = new ListNode(value2);
            dummynode = dummynode.next;
            carry = 0;
        }
        else{
            dummynode.next = new ListNode(value2%10);
            carry = 1;
            dummynode = dummynode.next;
        }
        l2 = l2.next;
        }
        if(carry != 0){
            dummynode.next = new ListNode(carry);
        }
        
return dummy.next; */

  ListNode dummy = new ListNode(-1);
  ListNode res = dummy;
  int carry = 0;
  while(l1 != null || l2 != null || carry != 0){
  int sumval = 0;
  if(l1 != null){
    sumval += l1.val;
    l1 = l1.next;
  }
  if(l2 != null){
    sumval += l2.val;
    l2 = l2.next;
  }
  sumval += carry;
  dummy.next = new ListNode(sumval%10);
  carry = sumval/10;
  dummy = dummy.next;
    }
    return res.next;
}
}
