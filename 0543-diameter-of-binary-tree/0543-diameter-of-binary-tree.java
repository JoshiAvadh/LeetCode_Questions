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
    public int maxDiam = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiam;
    }
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);

        maxDiam = Math.max(maxDiam, left + right);

        return 1 + Math.max(left, right);
    }
}