class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> list=new HashSet<>();
        for(int n1:banned)list.add(n1);
        int sum=0;
        int count=0;
     for(int i=1;i<=n;i++){
        if(!list.contains(i) && sum<maxSum){
            sum+=i;
            count++;
            }
            
        if(sum>maxSum)return count-=1;    
        
     } 
        return count;  
    }
}