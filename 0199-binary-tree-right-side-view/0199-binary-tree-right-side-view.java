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

    public void bfs(TreeNode root, HashMap<Integer,Integer> hash, int level){
        if(root == null){
            return;
        }
        if(!hash.containsKey(level+1)){
            hash.put(level+1, root.val);
        }
        bfs(root.right, hash, level+1);
        bfs(root.left, hash, level+1);


    }
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        bfs(root, hash, -1);

        for (Integer value : hash.values()) {
            System.out.println(res.add(value));
        }
        return res;
    }
}