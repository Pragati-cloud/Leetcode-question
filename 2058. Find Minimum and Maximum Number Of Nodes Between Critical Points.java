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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        if(head == null ) {
            ans[0] =-1;

            ans[1] =-1;
            return ans;
        }
        List<Integer> critical = new ArrayList<>();
        ListNode prev=head;
        ListNode cur= head.next;
        int pos =1;

        while(cur.next !=null){
            if((cur.val >prev.val && cur.val > cur.next.val) || (cur.val< prev.val && cur.val<cur.next.val)){
                critical.add(pos);
            }
            prev = cur;
            cur = cur.next;
            pos++;
        
        }
        if(critical.size()< 2) {
            ans[0] =-1;
            ans[1] =-1;
            return ans;
        }

        int min = Integer.MAX_VALUE;
        int max = critical.get(critical.size() -1) - critical.get(0);

        for(int i=1; i<critical.size() ; i++){
            min = Math.min(min, critical.get(i) -critical.get(i-1));
        }
        ans[0]= min;
        ans[1] =max;
        return ans;
    }
}
