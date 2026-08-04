class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            int leind=0;
            int riind=nums.length-1;
            if(i>0){
               while(leind<i)left+=nums[leind++];  
            }
            if(i<nums.length-1){
                while(riind>i)right+=nums[riind--];
            }
            if(left==right)return i;
        }
        return -1;
    }
}