class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        Stack<Long> s=new Stack<>();
        for(int num:nums){
            long val=num;
            while(!s.isEmpty()&& s.peek()==val){
                s.pop();
                val=val*2;
            }
            s.push(val);
        } 
         List<Long> arr=new ArrayList<>(s);
        return arr;
    }
}