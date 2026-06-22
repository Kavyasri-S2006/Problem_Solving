class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int pd=1;
            for(int j=i;j<nums.length;j++){
                if(pd<k){
                if(i==j)pd*=nums[j];
                else{
                    pd*=nums[j];
                }
                if(pd<k)count++;
                }
                else break;
            }
        }
        return count;
    }
}