class Solution {
    public int largestAltitude(int[] gain) {
        int total_max=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
             max+=gain[i];
             total_max=Math.max(max,total_max);
        }
        return total_max;
    }
}