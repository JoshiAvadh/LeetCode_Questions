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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> lvl = new ArrayList<>();
            lvl.add(q.remove().val);

            for(int i = 0; i < size; i++) {
                
            }
            if()
        }
    }
}