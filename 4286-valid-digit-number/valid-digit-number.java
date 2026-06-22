class Solution {
    public boolean validDigit(int n, int x) {
        boolean vd=false;
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            if(rem==x)vd=true;
            rev=rev*10+rem;
            temp/=10;
        }
        int fd=rev%10;
        if(vd && fd!=x)return true;
        return false;
    }
}