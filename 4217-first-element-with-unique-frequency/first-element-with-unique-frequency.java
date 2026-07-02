class Solution {
    public int firstUniqueFreq(int[] nums) {
      Map<Integer,Integer> map=new LinkedHashMap<>();
      
      for(int n:nums){
       map.put(n,map.getOrDefault(n,0)+1);
      }
    Map<Integer,Integer> m=new LinkedHashMap<>();
    for(int n:map.values()){
        m.put(n,m.getOrDefault(n,0)+1);
    }
    int tar=0;
    for(Map.Entry<Integer,Integer> e:m.entrySet()){
         if(e.getValue()==1){
             tar=e.getKey();
              break; 
              } 
        }
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             if(entry.getValue()==tar)return entry.getKey();
              }
    // for(Map.Entry<Integer,Integer> e:m.entrySet()){
    //     if(e.getValue()==1){
    //         tar=e.getKey();
    //         break;
    //     }
    // }
    // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //     if(entry.getValue()==tar) return map.entrySet();
    // }
    // for(int n:nums){
    //     int freq=map.get(n);
    //     if(m.get(freq)==1) return n ;
    // }
    return -1;
    }
}