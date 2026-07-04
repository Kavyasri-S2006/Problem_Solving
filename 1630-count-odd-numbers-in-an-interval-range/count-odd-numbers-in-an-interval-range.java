class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int l=low;
        int h=high;
       while(low<=high){
            if(low%2!=0){
                count++;low+=2;
            }
            else{
                low++;
            }

       }
        return count;
        //return (high-low)-1;

    }
}