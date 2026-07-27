class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        // int[] arr=new int[n];
        // Arrays.fill(arr,0);
      
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0)arr[j]=1;
        //        else{
        //        if(j!=0 && (j+1)%(i+1)==0){
        //         if(arr[j]==1)arr[j]=0;
        //         else arr[j]=1;
        //             }
        //        }
        //     }
        // }
        // int count=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==1)count++;
        // }
        // return count;
    }
}