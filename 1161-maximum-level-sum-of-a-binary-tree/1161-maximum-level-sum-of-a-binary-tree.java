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

    public void dfs(TreeNode root, HashMap<Integer,Integer> map, int level){
        if(root == null){
            return;
        }
        map.put(level+1, map.getOrDefault(level+1,0)+root.val);
        dfs(root.left,map,level+1);
        dfs(root.right,map,level+1);
    }

    public int maxLevelSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        dfs(root, map, -1);
        int sum = Integer.MIN_VALUE;
        int res = 0;
         for (Integer i : map.keySet()) {
            if (sum < map.get(i)) {
                sum = map.get(i);
                res = i;
            }
        }
        
        return res+1;
    }
}