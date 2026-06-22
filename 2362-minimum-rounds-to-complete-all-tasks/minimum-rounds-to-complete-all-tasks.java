class Solution {
    public int minimumRounds(int[] tasks) {
      Map<Integer,Integer> map=new HashMap<>();
      int count=0;
      for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
      }  
      for(Integer val: map.values()){
        if(val<=1)return -1;
            int v=(val+2)/3;
            count+=v;
      }
      return count;
      
    }
}