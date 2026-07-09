class Solution {
    public int totalSteps(int[] nums) {
      int n=nums.length;
      Stack<int[]> stack=new Stack<>();
      int maxstep=0;
      for(int i=n-1;i>=0;i--){
        int step=0;
        while(!stack.isEmpty() && nums[i]>stack.peek()[0]){
            step=Math.max(step+1,stack.peek()[1]);
            stack.pop();
        }
        maxstep=Math.max(maxstep,step);
        stack.push(new int[] {nums[i],step});
      } 
      return maxstep; 
    }
}