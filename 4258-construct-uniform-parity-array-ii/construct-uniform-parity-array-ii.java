class Solution {
    public boolean uniformArray(int[] nums) {
       int min=Integer.MAX_VALUE;
       int evenCount=0;
       for(int num:nums){
        if(num<min)min=num;
        if(num%2==0)evenCount++;
       } 
       int n=nums.length;
       boolean alleven=(evenCount==n);
       boolean ismin=(min%2==1);
       return alleven||ismin;
    }
}