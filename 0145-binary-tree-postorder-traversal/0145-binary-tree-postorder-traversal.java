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
    List<Integer> lit = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
        {
            return lit;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        lit.add(root.val);
        return lit;
    }
}