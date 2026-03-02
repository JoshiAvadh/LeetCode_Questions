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
    class Info{
        int ht;
        int diam;

        Info(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public Info getDiam(TreeNode root) {
        if(root == null) {
            return new Info(0,0);
        }
        Info lh = getDiam(root.left);
        Info rh = getDiam(root.right);
        
        int diam = Math.max(Math.max(lh.diam, rh.diam), lh.ht + rh.ht);
        int h = Math.max(lh.ht, rh.ht) + 1;
       

        return new Info(h, diam);
    } 
    public int diameterOfBinaryTree(TreeNode root) {
        return getDiam(root).diam;
    }
}