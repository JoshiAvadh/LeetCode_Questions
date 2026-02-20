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
    public void travel(List<Integer> ls, TreeNode root) {
        if(root == null) {
            return;
        }
        ls.add(root.val);
        travel(ls, root.left);
        travel(ls, root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        travel(ls, root);
        return ls;
    }
}