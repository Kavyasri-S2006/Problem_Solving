class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd_sum=1;
        int even_sum=2;
        int odd=1;
        int even=2;
        int i=1;
        while(i<n){
            odd+=2;
            odd_sum+=odd;
            even+=2;
            even_sum=even;
            i++;
        }
        if(odd_sum %n==0 && even_sum %n==0)return n;
      //return n;
      return 0;
       
    }
}