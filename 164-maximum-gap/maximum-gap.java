class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int sub=nums[i]-nums[i-1];
            max=Math.max(sub,max);
        }
        return max;
    }
}