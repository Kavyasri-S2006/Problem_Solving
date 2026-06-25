class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
      int sum=0;
      for(int i=0;i<nums.length;i++)  {
        int len=0;
        int tcount=0;
        for(int j=i;j<nums.length;j++){
            len++;
            if(nums[j]==target) tcount++;
            int l=len/2;
            if(tcount>l)sum++; 
        }
      }
      return sum;
    }
}