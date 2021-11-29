package Tree;

public class JZ27 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode left = mirrorTree(root.left);
            TreeNode right = mirrorTree(root.right);
            root.right = left;
            root.left = right;
            return root;
        }
    }


}
