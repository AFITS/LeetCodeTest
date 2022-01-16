package List;

public class JZ24反转链表 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode prev = new ListNode(), curr = head, after;
            prev.next = head;
            while (curr.next != null) {
                after = curr.next;
                curr.next = after.next;
                after.next = prev.next;
                prev.next = after;
            }
            return prev.next;
        }
    }

}
