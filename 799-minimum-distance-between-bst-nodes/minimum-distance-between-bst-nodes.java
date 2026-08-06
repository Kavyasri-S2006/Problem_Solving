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
    public int minDiffInBST(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();
      int min=Integer.MAX_VALUE;
      List<Integer> list=new ArrayList<>();
      if(root!=null){
        q.add(root);
        list.add(root.val);
      }
      while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left!=null){
                q.add(temp.left);
                list.add(temp.left.val);
            }
            if(temp.right!=null){
                q.add(temp.right);
                list.add(temp.right.val);
            }
      }
      for(int i=0;i<list.size()-1;i++){
       for(int j=i+1;j<list.size();j++){
        int diff=Math.abs(list.get(i)-list.get(j));
        min=Math.min(min,diff);
       }
      }
    return min;
    }
}