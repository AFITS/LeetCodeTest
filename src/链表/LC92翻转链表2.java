package 链表;

public class LC92翻转链表2 {
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
    // 类似的题目都采用dummy的方式来解答，避免出现head也要进行翻转，导致返回的head不是理想目标
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode curr = prev.next, after;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        curr = prev.next;
        for (; left < right; left++) {
            after = curr.next;
            curr.next = after.next;
            after.next = prev.next;
            prev.next = after;
        }
        return dummyNode.next;
    }
}
