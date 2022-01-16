package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序遍历，BFS
 */
public class LC102二叉树的层序遍历 {
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

    //    class Solution {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> ret = new ArrayList<List<Integer>>();
//            if (root == null) return ret;
//
//            Queue<TreeNode> queue = new LinkedList<TreeNode>();
//            queue.offer(root);
//            while (!queue.isEmpty()) {
//                List<Integer> level = new ArrayList<>();
//                int currentLevelSize = queue.size();
//                for (int i = 1; i <= currentLevelSize; ++i) {
//                    TreeNode node = queue.poll();
//                    level.add(node.val);
//                    if (node.left != null) {
//                        queue.offer(node.left);
//                    }
//                    if (node.right != null) {
//                        queue.offer(node.right);
//                    }
//                }
//                ret.add(level);
//            }
//            return ret;
//        }
//    }
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() != 0){

            }
        }

    }
}
