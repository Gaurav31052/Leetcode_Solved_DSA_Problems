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
    public void search(TreeNode root, int val,TreeNode[] res){
         if(root == null){
            res[0] = root;
            return;
        }
         if(root.val == val){
            res[0] = root;
            return;

        }
        if(root.val > val){
        search(root.left,val,res);

        }
        else{
        search(root.right,val, res);

        }
        
    }

    public TreeNode searchBST(TreeNode root, int val) {
       TreeNode[] res = new TreeNode[1];
         search(root,val,res);
        return res[0];

    }
}