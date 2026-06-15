class Solution {
    public int finalElement(int[] nums) {
        int left=nums[0];
        int right = nums[nums.length-1];
        int res = nums[0];
        res=Math.max(left,right);
        return res;
    }
}