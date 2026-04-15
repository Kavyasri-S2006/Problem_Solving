class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digisum=0;
      for(int i=0;i<nums.length;i++){
        elesum+=nums[i];
      }
      for(int i=0;i<nums.length;i++){
        while(nums[i]!=0){
            int rem=nums[i]%10;
            digisum+=rem;
            nums[i]/=10;
        }
      }
      return elesum-digisum;  
    }

}