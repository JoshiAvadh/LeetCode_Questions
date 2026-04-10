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
    public int goodNodes(TreeNode root) {
        return calcNodes(root, root.val);
    }
    public int calcNodes(TreeNode root, int maxVal) {
        if(root == null) {
            return 0;
        }
        int result;
        if(root.val >= maxVal) {
            result = 1;
        } else {
            result = 0;
        }
        maxVal = Math.max(root.val, maxVal);

        return result + calcNodes(root.left, maxVal) + calcNodes(root.right, maxVal);
    }   
}