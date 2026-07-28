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
    public boolean Symmetric(TreeNode p,TreeNode q){
        // p=root.left;
        // TreeNode q=root.right;
        if(p==null && q==null)return true;
        if(p!=null && q!=null && p.val==q.val){
            return (Symmetric(p.left,q.right) && Symmetric(p.right,q.left));
        }
        return false;
        }
    
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return false;
        TreeNode p=root.left;
        TreeNode q=root.right;
        boolean res=Symmetric(p,q); 
        return res;
       } 
       // if(isSymmetricroot.left)== isSymmetric(root.right) || )
    
}