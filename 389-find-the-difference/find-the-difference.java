class Solution {
    public char findTheDifference(String s, String t) {
        char[] c=s.toCharArray();
        char[] ch=t.toCharArray();
        int[] freq=new int[26];
        for(int i=0;i<c.length;i++)freq[c[i]-'a']++;
        for(int i=0;i<ch.length;i++){
        freq[ch[i]-'a']--;
        if(freq[ch[i]-'a']<0)return ch[i];
        
        }
        return ' ';
    }
}