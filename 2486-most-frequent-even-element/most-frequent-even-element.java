class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int min=Integer.MAX_VALUE;
        //int val=1;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if( en.getKey()%2==0 && en.getValue()>=max){
                if(max==en.getValue()){
                    min=Math.min(min,en.getKey());
                }
                else{
                min=en.getKey();
                max=en.getValue();
                }       
            }
        }
       // else min=nums[0];
       
       // if(min>0)return min;
        return min==Integer.MAX_VALUE?-1:min;
    }
}