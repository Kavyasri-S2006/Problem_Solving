class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int s=nums.length;
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
                if(en.getValue()>s/3)list.add(en.getKey());
        }
        return list;
    }
}