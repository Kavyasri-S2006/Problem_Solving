class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
          if(nums[i]>=first_max){
            third_max=second_max;
            second_max=first_max;
            first_max=nums[i];
          }
          else if(nums[i]<first_max && nums[i]>=second_max){
            third_max=second_max;
            second_max=nums[i];
          }
          else if (nums[i]<second_max && nums[i]>=third_max){
          third_max=nums[i]; 
          }
          if(nums[i]<=first_min){
            second_min=first_min;
            first_min=nums[i];
          } 
        else if(nums[i]<second_min) second_min=nums[i];
       } 
       max=first_max*(second_max*third_max);
        max2=first_max*(first_min*second_min);
       return Math.max(max,max2);
    }
}