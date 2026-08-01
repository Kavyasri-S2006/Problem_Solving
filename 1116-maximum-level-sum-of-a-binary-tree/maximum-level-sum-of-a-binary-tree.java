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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        if(root!=null){
        q.add(root);
        }
        int c=0;
        int count=0;
        while(!q.isEmpty()){
            int sum=0;
            count++;
            int size=q.size();
            for(int i=0;i<size;i++){
              TreeNode temp=q.poll();
              sum+=temp.val;  
              if(temp.left!=null)q.add(temp.left);
             if(temp.right!=null)q.add(temp.right);
            }
            if(sum>max){
                max=sum;
                c=count;
            }
        }
        return c;
    }
}