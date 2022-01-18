package 双指针;

import com.sun.media.sound.SF2InstrumentRegion;

public class JZ22_链表中倒数第k个节点 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && k > 0) {
                fast = fast.next;
                k--;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }


}
