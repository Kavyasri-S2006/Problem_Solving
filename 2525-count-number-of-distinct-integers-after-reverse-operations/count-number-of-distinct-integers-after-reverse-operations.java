class Solution {
    public int countDistinctIntegers(int[] nums) {

   Set<Integer> set=new HashSet<>();
   for(int n:nums)set.add(n);
   for(int n:nums){
    int rev=0;
    while(n!=0){
        int rem=n%10;
        rev=rev*10+rem;
        n/=10;
    }
    set.add(rev);
   }
   return set.size();

    // int count=1;
    // List<Integer> list=new ArrayList<>(); 
    // for(int n:nums)list.add(n);
    
    // for(int n:nums){
    //     int rev=0;
    //     while(n!=0){
    //         int rem=n%10;
    //         rev=rev*10+rem;
    //         n/=10;
    //     }
    //    list.add(rev);
    // } 
    // Collections.sort(list);
    // for(int i=1;i<list.size();i++){
    //     if(list.get(i)>list.get(i-1))count++;
    // }
    //return count;
    }
}