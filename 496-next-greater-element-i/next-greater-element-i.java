class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean t=true;
            //int num=0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i])t=false;                  
                 if( !t &&  nums2[j]>nums1[i]){
                   // t=true;
                   res[i]=nums2[j];
                   break;
                 }
                
                }
           if(res[i]==0)res[i]=-1;
        }
        return res;
    }
}