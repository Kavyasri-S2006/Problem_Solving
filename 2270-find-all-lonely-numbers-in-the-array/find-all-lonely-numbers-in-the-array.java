class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 && nums[i]!=nums[i-1]&& nums[i-1]!=nums[i]-1)list.add(nums[i]);
            if(i==0 && nums[i]!=nums[i+1] && nums[i+1]!=nums[i]+1)list.add(nums[i]);
            else if(i>0 && i<nums.length-1){
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1] && nums[i]-1!=nums[i-1] && nums[i]+1!=nums[i+1])list.add(nums[i]);
            }
        }
    return list;
    }
}