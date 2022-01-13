package Lest;

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



            ListNode cur = head;
            ListNode pre = new ListNode();
            ListNode after;
            pre.next = cur;

            for (int i = 0; i < length / k; i++) {
                for (int j = 0; j < k - 1; j++) {
                    after = cur.next;
                    cur.next = after.next;
                    after.next = pre.next;
                    pre.next = after;
                }
                pre = cur;
                cur = cur.next;
            }

            return result;

        }


    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.println(new Solution().reverseKGroup(a, 2));
    }
}

