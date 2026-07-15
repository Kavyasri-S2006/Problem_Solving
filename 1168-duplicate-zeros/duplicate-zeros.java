class Solution {
    public void duplicateZeros(int[] arr) {
       List<Integer> list=new ArrayList<>();
       for(int n:arr)list.add(n);
       int n=arr.length;
       int i=0;
       int ind=0;
       while(i<n){
        if(list.get(ind)==0){
                arr[i]=list.get(ind);
                if(i+1!=n)i++;
                arr[i]=0;
                i++;
        }
       else {
        arr[i]=list.get(ind);
        i++;
       }
       ind++;
       }
    }
}