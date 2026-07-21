class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            int sub=max-nums[i];
            if(sub!=0)count+=sub;
        }
        return count;
    }
}