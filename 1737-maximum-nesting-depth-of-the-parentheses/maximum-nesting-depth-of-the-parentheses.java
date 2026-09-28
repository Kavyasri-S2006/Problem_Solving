class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')count++;
            if(c==')')count--;
            max=Math.max(count,max);
        }
        return max;
    }
}