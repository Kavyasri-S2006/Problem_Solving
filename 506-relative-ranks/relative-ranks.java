class Solution {
    public String[] findRelativeRanks(int[] score) {
      int arr[]=new int[score.length];
      for(int i=0;i<score.length;i++)arr[i]=score[i];
      String[] s=new String[score.length];
      Arrays.sort(arr);
      int count=arr.length+1;
      Map<Integer,String> map=new HashMap<>();
      for(int n:arr){
        count--;
        if(count==1) map.put(n,"Gold Medal");
        if(count==2) map.put(n,"Silver Medal");
        if(count==3) map.put(n,"Bronze Medal");
       if(count>3) map.put(n,String.valueOf(count));
        
      }
      for(int i=0;i<score.length;i++) {
        s[i]=map.get(score[i]);
      } 
      return s;
    }
}