class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double max=Integer.MIN_VALUE;
        int count=0;
        int n=position.length;
        Map<Integer,Integer> map=new LinkedHashMap<>();
      for(int i=0;i<n;i++){
        map.put(position[i],speed[i]);
      } 
      Arrays.sort(position);
      for(int i= n-1;i>=0;i--){
        double dis=target-position[i];
        double sp=map.get(position[i]);
            double t=(dis/sp);
            if(t>max){
                count++;
                max=t;
            }    
        } 
        return count;
    }
}