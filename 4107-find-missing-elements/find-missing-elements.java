class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
            list.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!list.contains(i))list.add(i);
            else list.remove(Integer.valueOf(i));
        }
        return list;
    }
}