class Solution {
    public int removeDuplicates(int[] nums) {
       
        int w=2;
        int r=2;
       // int count=1; 
        while(r<nums.length){
            if(nums[w-2]==nums[r]){
              r++;
                }  
            else  {
                nums[w]=nums[r];
                w++;
                r++;
            }
               
        }
        return w;
    }
}