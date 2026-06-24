class Solution {
    public int prefixConnected(String[] words, int k) {
        int count=0;
      Map<String,Integer> map=new HashMap<>();
      for(String s:words){
        if(s.length()>=k){
        String s1=s.substring(0,k);
        map.put(s1,map.getOrDefault(s1,0)+1);
        if(map.get(s1)==2)count++;
      }
      }
      return count;
    }
}