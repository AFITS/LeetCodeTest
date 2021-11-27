package Tree;

/**
 * 判断二叉树是否为平衡二叉树
 */
public class JZ55 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class TreeNode {
        JZ55.TreeNode left;
        JZ55.TreeNode right;

        TreeNode() {
        }
    }

    // F1 自顶向上的方式
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return helper(root) != -1;
        }

        public int helper(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);
            if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
                return -1;
            }
            return Math.max(left, right) + 1;
        }
    }

    // F2 自顶向下的方式
    class Solution2 {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            else {
                return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
            }

        }

        public int height(TreeNode root) {
            if (root == null) return 0;
            else {
                return Math.max(height(root.left), height(root.right)) + 1;
            }
        }
    }

}