class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list =new HashSet<>(); 
        Set<Integer> res=new HashSet<>();
        for(int n:nums1)list.add(n);
        for(int n:nums2){
            if(list.contains(n)){
                res.add(n);
                list.remove(Integer.valueOf(n));
            }
        }
        int[] arr= new int[res.size()];
        int i=0;
        for(int r:res) arr[i++]=r;
        return arr;
    }
}