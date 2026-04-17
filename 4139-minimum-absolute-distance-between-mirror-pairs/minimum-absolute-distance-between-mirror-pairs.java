class Solution {
    public int reverse(int n){
        int res=0;
        while(n!=0){
            int rem=n%10;
            res = res* 10+rem;
            n/=10;
        }
        return res;
    }
    public int minMirrorPairDistance(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>(); 
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int rev=reverse(nums[i]);
        if(map.containsKey(nums[i])){
            int dist=Math.abs(i-map.get(nums[i]));
            min=Math.min(min,dist);
        }
        map.put(rev,i);
       }
       return min==Integer.MAX_VALUE?-1:min;
    }
}