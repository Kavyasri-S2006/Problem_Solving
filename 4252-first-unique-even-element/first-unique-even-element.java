class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> map=new   LinkedHashMap<>();
        for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getKey()%2==0 && e.getValue()==1)return e.getKey();
        }
        return -1;
    }
}