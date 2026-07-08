class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums=new int[n][n];
        int num=1;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right =n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                nums[top][i]=num;
                num++;
            }
            top++;
            for(int i= top;i<=bottom;i++){
                nums[i][right]=num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    nums[bottom][i]=num;
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    nums[i][left]=num;
                    num++;
                }
                left++;
            }
            
        }
        return nums;

    }
}