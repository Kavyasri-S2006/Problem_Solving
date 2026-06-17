class Solution {
    public int[] divisibilityArray(String word, int m) {
      int n=word.length();
      long rem=0;
     String s="";
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        int dig=word.charAt(i)-'0';
       rem=(rem*10+dig)%m;
        if(rem==0)arr[i]=1;
      } 
      return arr;
    }
}