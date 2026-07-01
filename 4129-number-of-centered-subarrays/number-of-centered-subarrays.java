class Solution {
    public int centeredSubarrays(int[] nums) {
            int c=0;
            for(int i=0;i<nums.length;i++){
                Set<Integer> set =new HashSet<>();
                int sum=0;
                for(int j=i;j<nums.length;j++){
                    set.add(nums[j]);
                    sum+=nums[j];
                    if(set.contains(sum))c++;
                }
            }
            return c;
        // int c=0;
        // List<Integer> list=new ArrayList<>();
        // for(int n:nums)list.add(n);
        // for(int i=0;i<nums.length;i++){
        //     int sum=0; 
        //     for(int j=i;j<nums.length;j++){
        //         list.add(nums[j]);
        //         sum+=nums[j];
        //         if(list.subList(i,j+1).contains(sum))c++;
        //     }
        // }
        // return c;
    }
}