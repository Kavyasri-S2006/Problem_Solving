class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int c=0;
       long sum=0;
        for(int i=0;i<n;i++)sum+=nums[i];
        long s=0;
        for(int i=0;i<n-1;i++){
            s+=nums[i];
            long sub=sum-s;
            if(s>=sub)c++;
        } 
        return c;
    }
}