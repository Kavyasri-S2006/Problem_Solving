class Solution {
    public long removeZeros(long n) {
       long temp=n;
       long rev=0;
       while(temp!=0){
        long r=temp%10;
        if(r!=0)rev=rev*10+r;
        temp/=10;
       } 
       while(rev!=0){
        long r=rev%10;
        temp=temp*10+r;
        rev/=10;
       }
       return temp;
    }
}