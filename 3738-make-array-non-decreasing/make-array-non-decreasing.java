class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            //int max=nums[i];
                if(nums[i]>=max)max=nums[i];
                    
                else n--;
        }
        return n;
    }
}