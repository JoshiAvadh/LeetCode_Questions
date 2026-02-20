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
    public void travel(TreeNode root, List<Integer> ls) {
        if(root == null) {
            return;
        }
        travel(root.left, ls);
        ls.add(root.val);
        travel(root.right, ls);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        travel(root, ls);
        return ls;
    }
}