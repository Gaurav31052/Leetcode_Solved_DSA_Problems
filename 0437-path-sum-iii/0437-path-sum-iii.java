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
    public static void findPath(TreeNode root, long target, long curr, int[] res){
        if(root == null){
            return;
        }
        curr += root.val;

        if(curr==target){
            res[0]++;
        }
        
        findPath(root.left, target, curr, res);
        findPath(root.right, target, curr, res);

    }

    public static void totalPath(TreeNode root, long target, int[] res){
        if(root==null){
            return;
        }
        findPath(root,target,0,res);

        totalPath(root.left, target, res);
        totalPath(root.right, target, res);
    }
    public int pathSum(TreeNode root, int targetSum) {
        int[] res = {0};
        totalPath(root, targetSum,res);
        return res[0];
    }
}