class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long max=nums[i];
            long min=nums[i];
            for(int j=i;j<nums.length;j++){
                if(i==j){
                    sum+=0;
                }
               min=Math.min(min,(long)nums[j]);
               max=Math.max(max,(long)nums[j]);
               sum+=(max-min);
               
        }
        }
        return sum;
    }
}