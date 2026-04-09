class Solution {
    public int trap(int[] arr) {
        int l=0,r=arr.length-1,leftmax=0,rightmax=0;
        int trap=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(leftmax<=arr[l]){
                    leftmax=arr[l];
                }
                else{
                    trap+=leftmax-arr[l];
                }
                l++;
            }
            else{
                if(rightmax<=arr[r]) rightmax=arr[r];
                else trap+=rightmax-arr[r];
                r--;
            }   
        }
        return trap; 
    }
}