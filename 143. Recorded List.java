public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if( head ==null || head.next == null) return;

        ListNode slow =head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow.next;
        slow.next = null;
        while(cur != null){
            ListNode temp1 = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp1;
        }
        ListNode one = head;
        ListNode two = prev;
        while(two != null){
            ListNode onenext = one.next;
            ListNode twonext = two.next;
            one.next = two;
            two.next = onenext;
            one = onenext;
            two = twonext;
        }
    }
    
}
