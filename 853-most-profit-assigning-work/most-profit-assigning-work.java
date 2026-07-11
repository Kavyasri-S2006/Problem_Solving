class Solution {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        int t_p=0;
        //int max=0;
        for(int i=0;i<w.length;i++){
            int max=0;
            for( int j=0;j<d.length;j++){
                if(d[j]<=w[i])max=Math.max(max,p[j]);
            }
            t_p+=max;
        }
        return t_p;
    }
}