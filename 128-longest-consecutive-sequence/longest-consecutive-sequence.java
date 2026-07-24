class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
       Arrays.sort(nums);
       int sum=nums[0];
       int max=-1;
       int count=1;
       if(nums.length==1)return count;
       for(int i=1;i<nums.length;i++){
            if(sum+1==nums[i]){
                count++;
                sum=nums[i];
                max=Math.max(max,count);
            }
             else if(sum==nums[i]){
                 max=Math.max(max,count);
                sum=nums[i];
            }
            else{
                max=Math.max(max,count);
                count=1;  
                sum=nums[i];          }
       } 
       return max;
    }
}