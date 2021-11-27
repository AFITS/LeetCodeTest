package Tree;

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


    //以下为提交代码 F1
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
}

