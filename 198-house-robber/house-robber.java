class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
        int[] arr = new int[n];

        int sum =0;
        int tsum =0;

        int max = nums[0];
        arr[0] = nums[0];
        for(int i=1;i<n;i++){
            sum =0;
            if(i==1){
                max = Math.max(max, nums[i]);
                tsum =max;
                arr[1]=max;
            }
            else{
                sum = nums[i]+arr[i-2];
                tsum = Math.max(sum, tsum);
                arr[i] = tsum;
            }
        }
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            res = Math.max(arr[i],res);
        }
       return res;
    }
}