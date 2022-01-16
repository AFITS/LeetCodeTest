package List;

public class LC24K个一组链表反转 {
    public static class ListNode {
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

    static class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode curr = head, pre = dummy, after;

            int length = 0;
            while (head != null) {
                length++;
                head = head.next;
            }

            for (int i = 0; i < length / k; i++) {
                for (int j = 0; j < k - 1; j++) {
                    after = curr.next;
                    curr.next = after.next;
                    after.next = pre.next;
                    pre.next = after;
                }
                pre = curr;
                curr = curr.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.println(new Solution().reverseKGroup(a, 2).val);
    }
}

