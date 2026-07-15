class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=arr1.length;
      for(int i=0;i<arr1.length;i++){
        int dis=0;
       // boolean t=false;
        for(int j=0;j<arr2.length;j++){
           dis=arr1[i]-arr2[j];
           if(Math.abs(dis)<=d){
            count--;
            break;
           }
        }
      }  
      return count;
    }
}