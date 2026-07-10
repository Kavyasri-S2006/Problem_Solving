class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> list=new ArrayList<>();
        if(nums.length==0 )return list;
        if(nums.length==1){
            list.add(String.valueOf(String.valueOf(nums[0])));
            return list;
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(nums[0]);
        for(int i=1;i<n;i++){
            int start=0;
            int end=0;
            if(!stack.isEmpty() && stack.peek()+1==nums[i]){
                stack.push(nums[i]);
                if(i==n-1){
                    end=stack.pop();
                    while(!stack.isEmpty()) start=stack.pop();
                    list.add(String.valueOf(start)+"->"+String.valueOf(end));
                }
                    
            }else{
                if(!stack.isEmpty()){
                    end=stack.pop();
                    if(stack.isEmpty())list.add(String.valueOf(end));
                    else{
                        while(!stack.isEmpty()){
                        start=stack.pop();
                    }
                    list.add(String.valueOf(start)+"->"+String.valueOf(end));
                    }
                }
            if(stack.isEmpty() && i==n-1 )list.add( String.valueOf(nums[i]));
            stack.push(nums[i]);
            }
        }
        return list;
    }
}
//         int n=nums.length;
//         List<String> list=new ArrayList<>();
//         if(nums.length==0 )return list;
//        int start=nums[0];
//         if(nums.length==1){
//             list.add(String.valueOf(start));
//             return list;
//         }
//         int end=nums[0];
//          int count=1;
       
//         for(int i=1;i<n;i++){
//             //int count=1
//             if(nums[i]==end+1){
//                 end=nums[i];
//                 count++;
//                 if(i==nums.length-1)list.add(String.valueOf(start)+"->"+String.valueOf(end));
//             }
//             else {
//             if (count!=1) list.add(String.valueOf(start)+"->"+String.valueOf(end));
//             if(count==1)list.add(String.valueOf(start));
//             start=nums[i];
//             end=nums[i];
//             count=1;
//             if(i==nums.length-1 ){
//                     if(start==end && count==1)list.add(String.valueOf(start));
//                 }
                
//         }
       
//     }
//      return list;
//     }
// }