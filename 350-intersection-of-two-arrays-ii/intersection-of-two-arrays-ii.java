class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list =new ArrayList<>(); 
        List<Integer> res=new ArrayList<>();
        for(int n:nums1)list.add(n);
        for(int n:nums2){
            if(list.contains(n)){
                res.add(n);
                list.remove(Integer.valueOf(n));
            }
        }
        int[] arr= new int[res.size()];
        for(int i=0;i<arr.length;i++)arr[i]=res.get(i);
        return arr;
    }
}