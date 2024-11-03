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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode[]> q = new LinkedList<>();
        q.add(new TreeNode[]{
            root.left, root.right
        });
        while(!q.isEmpty()){
            int size = q.size();
            while(size --> 0){
                TreeNode[] removed = q.remove();
                TreeNode nodeone = removed[0];
                TreeNode nodetwo = removed[1];
            if(nodeone == null && nodetwo == null){
                return false;
            }
            if(nodeone.val != nodetwo.val){
                continue;
            }
            q.add(new TreeNode[]{
                nodeone.left, nodetwo.right
            });
            q.add(new TreeNode[]{
                nodeone.right, nodetwo.left
            });
        }
    }
    return true;
}
}