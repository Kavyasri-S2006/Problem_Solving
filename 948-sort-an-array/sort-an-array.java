class Solution {
    public int[] sortArray(int[] nums) {
     int[] arr=new int[nums.length];
     List<Integer> list = new ArrayList<>(); 
     for(int n:nums) list.add(n);
     Collections.sort(list);
     for(int i=0;i<list.size();i++)arr[i]=list.get(i);
     return arr;
    }
}