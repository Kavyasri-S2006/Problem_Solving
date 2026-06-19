class Solution {
    public boolean isDigitorialPermutation(int n) {
        
        int sum=0;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }

        char[] c1=String.valueOf(temp).toCharArray();
        char[] c2=String.valueOf(sum).toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1,c2);
    }
}