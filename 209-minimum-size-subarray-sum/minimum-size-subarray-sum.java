class Solution {
    public int minSubArrayLen(int target, int[] nums) { 
        int min=Integer.MAX_VALUE;
        int left =0;
        int right=0;
        int count=0;
        int sum=0;
        while(right<nums.length){
            if(sum<target){
            sum+=nums[right];
            right++;
            count++;
            }
            while(sum>=target){
                min=Math.min(min,count);
                sum-=nums[left];
                left++;
                count--;
            }
        }
        if(min==Integer.MAX_VALUE)return 0;
        return min;
    }
}