class Solution {
    public int findPeakElement(int[] nums) {
      int peak=0;
      for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                peak=i;
                //return peak;
            }
        if (i+1!=nums.length && nums[i-1]<nums[i] && nums[i+1]<nums[i] ){
            peak=i;
        }
        
      }  
      return peak;
    }
}