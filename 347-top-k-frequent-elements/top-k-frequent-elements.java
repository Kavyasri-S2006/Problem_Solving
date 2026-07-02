class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] arr=new int[k];
       int max=Integer.MIN_VALUE;
      // if(nums.length==1)return nums[0];
       Map<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       } 
            PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
            pq.addAll(map.entrySet());
            for(int i=0;i<k;i++)arr[i]=pq.poll().getKey();
            return arr;
    }
}