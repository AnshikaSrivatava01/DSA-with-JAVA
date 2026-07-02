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
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int lh = calculateHeight(node.left);
        int rh = calculateHeight(node.right);

        int currentDiameter = lh + rh;
        maxDiameter = Math.max(maxDiameter, currentDiameter);
        return 1+Math.max(lh, rh);
    }
}
