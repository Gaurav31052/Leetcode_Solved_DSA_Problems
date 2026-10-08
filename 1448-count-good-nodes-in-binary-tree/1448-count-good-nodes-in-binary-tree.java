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
    public static void findGoodNode(TreeNode root, int max, int[] res){
        if(root == null){
            return;
        }
        if(root.val >= max){
            res[0]++;
            
        }
        int newmax = Math.max(max,root.val);

        findGoodNode(root.left, newmax, res);
        findGoodNode(root.right, newmax, res);
    }
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[] res = {0};

        findGoodNode(root,max,res);
        return res[0];
        
    }
}