class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)return false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && i-j<=k)return true;
                c++;
                if(c>k)break;
            }
        }
        return false;
    }
}