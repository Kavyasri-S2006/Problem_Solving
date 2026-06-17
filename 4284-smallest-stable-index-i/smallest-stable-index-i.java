class Solution {
    public int firstStableIndex(int[] arr, int a) {
       int n= arr.length; 

        for(int i=0;i<n;i++){
            int max=0;
            int min=arr[i];
            for(int j=0;j<=i;j++){
                if(arr[j]>max)max=arr[j];
            }
            for(int k=i;k<n;k++){
                if(arr[k]<min)min=arr[k];
            }
            if((max-min)<=a)return i;
            else continue;
        }
        return -1;
    }
}