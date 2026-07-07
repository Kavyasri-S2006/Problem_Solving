class Solution {
    public long sumAndMultiply(int n) {
        long temp=n;
        long sum=0;
        long rev=0;
        while(temp!=0){
            long rem=temp%10;
            if(rem!=0){
                sum+=rem;
                rev=rev*10+rem;
            }
            temp/=10;
        }
        while(rev!=0){
            long rem=rev%10;
            temp=temp*10+rem;
            rev/=10;
        }
        return temp*sum;
    }
}