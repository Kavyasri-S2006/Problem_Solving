class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] freq=new int[26];
        for(char i:s.toCharArray())freq[i-'a']++;
        for(char i:t.toCharArray()){
        freq[i-'a']--;
        if(freq[i-'a']<0) return i;
        
        }
        return ' ';
    }
}