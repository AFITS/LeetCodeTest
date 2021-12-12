package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序遍历
 */
public class JZ44二叉树每层最大值 {

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

    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                int max = queue.peek().val;
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    max = Math.max(temp.val, max);
                    if (temp.left != null) queue.add(temp.left);
                    if (temp.right != null) queue.add(temp.right);
                }
                result.add(max);
            }
            return result;
        }
    }
}
