class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int count=0;
       while(n>1&&count<10) {
        int s=0;
        while(n>0){
        int a=n%10;
        s+=(a*a);
        n/=10;
        }       
        count++;
        if(s==1){ return true;}
        n=s;
       }
       return false;
    }
}