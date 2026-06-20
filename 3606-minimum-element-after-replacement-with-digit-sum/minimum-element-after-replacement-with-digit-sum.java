class Solution {
    public int minElement(int[] nums) {
      
      for(int i=0;i<nums.length;i++){
        int sum=0;
        if(nums[i]>=10){
        while(nums[i]!=0){
            int rem=nums[i]%10;
            sum+=rem;
            nums[i]/=10;
        }
        nums[i]=sum;
        }
        
      }
      int min=nums[0];  
      for(int i=0;i<nums.length;i++ ) min=Math.min(min,nums[i]);
      return min;
    }
}