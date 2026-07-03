class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);
        for(int n:map.values())max=Math.max(n,max);
        ArrayList<Integer> l=new ArrayList<>();
        for(int n:nums)l.add(n);
        for(int i=0;i<max;i++){
         List<Integer> l1=new ArrayList<>();
         int ind =0;
         while(ind<l.size()){
         //for(int j=0;j<l.size();j++){
            int n=l.get(ind);
            if(!l1.contains(n)){
                l1.add(n);
            l.remove(ind);
            }
            else ind++;
         }
        //}
         list.add(l1);
        }
        return list;
    }
}