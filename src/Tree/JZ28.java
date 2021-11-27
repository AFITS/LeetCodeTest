package Tree;

import java.util.LinkedList;

/**
 * 对称二叉树 剑指22题
 */
public class JZ28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    // F1：递归+DFS
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return root == null ? true : help(root.left, root.right);
        }

        public boolean help(TreeNode left, TreeNode right) {
            if (left == null || right == null) {
                return left == right;
            }
            if (left.val != right.val) {
                return false;
            }
            return help(left.left, right.right) && help(left.right, right.left);
        }
    }

    // F2 队列方式实现
    class Solution2 {
        public boolean isSymmetric(TreeNode root) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root.left);
            queue.add(root.right);
            while (queue.size() > 0) {
                TreeNode left = queue.removeFirst();
                TreeNode right = queue.removeFirst();
                // 则只有均空时为真，不可return，继续执行
                if (left == null && right == null) {
                    continue;
                }
                // 剩余为其中一个为空，不对称，直接返回
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }
                // 左左&&右右
                queue.add(left.left);
                queue.add(right.right);
                // 左右&&右左
                queue.add(left.right);
                queue.add(right.left);
            }
            return true;
        }
    }


}

