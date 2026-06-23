class Solution {
    public long getDescentPeriods(int[] nums) {
        long count=nums.length;
       long len=1;
       for(int i=1;i<nums.length;i++){
                if((nums[i-1])-nums[i]==1){
                    count+=len;
                    len++;
                }
                else len=1;
                
        }
      return count;      
        
    }
}