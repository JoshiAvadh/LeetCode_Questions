/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        diam(root, res);
        return res[0];
    }
    public int diam(TreeNode root, int[] res) {
        if(root == null) {
            return 0;
        }

        int left = diam(root.left, res);
        int right = diam(root.right, res);

        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
}