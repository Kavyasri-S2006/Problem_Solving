class Solution {
    public int firstUniqueFreq(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
      
      for(int n:nums){
       map.put(n,map.getOrDefault(n,0)+1);
      }
    Map<Integer,Integer> m=new HashMap<>();
    for(int n:map.values()){
        m.put(n,m.getOrDefault(n,0)+1);
    }
    for(int n:nums){
        int freq=map.get(n);
        if(m.get(freq)==1) return n ;
    }
    return -1;
    }
}