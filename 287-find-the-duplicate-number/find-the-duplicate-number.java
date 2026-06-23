class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       int n=0;
       for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>=2)return num;
       }
        return 0;
    }
}