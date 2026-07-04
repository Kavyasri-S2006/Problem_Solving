class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int l=0;
        if(low%2==0) l=low+1;
        else l=low;
        for(int i=l;i<=high;i+=2){
            if(i==high && i%2!=0 )count++;
            else count++;
        }
        // int l=low;
        // int h=high;
    //    while(low<=high){
    //         if(low%2!=0){
    //             count++;low+=2;
    //         }
    //         else{
    //             low++;
    //         }

    //    }
        return count;
        //return (high-low)-1;

    }
}