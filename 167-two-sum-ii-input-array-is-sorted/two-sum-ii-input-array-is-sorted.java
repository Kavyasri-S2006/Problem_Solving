class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] ans=new int[2];
     int left=0;
     int right=nums.length-1;
     while(right>left){
        int sum=nums[left]+nums[right];
        if(sum<target)left++;
        if(sum>target)right--;
        if(sum==target){
            ans[0]=left+1;
            ans[1]=right+1;
            break;
        }
     }
     return ans;
    }
}