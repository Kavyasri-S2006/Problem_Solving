class Solution {
    public boolean canAliceWin(int[] nums) {
       int asum=0;
       int bsum=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<=9)asum+=nums[i];
        else{
         bsum +=nums[i];  
        }
       }
       if(asum==bsum)return false;
       if(asum>bsum)return true;
       return true;
    }
}