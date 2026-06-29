class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int max=0;
        int min=0;
        int x=0;
        int sum=0;
        for(int i=0;i<differences.length;i++){
            sum+=differences[i];
            min=Math.min(sum,min);
            max=Math.max(sum,max);
            if(max-min>upper-lower) return 0;
        }
        
        return (upper-lower)-(max-min)+1;
    }
}