class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] freq= new char[26];
        for(char c : s.toCharArray()) freq[c-'a']++;
        for(char c : t.toCharArray()) freq[c-'a']--;
        for(int i =0;i<freq.length;i++) {
            if ( freq[i]!= 0) return false;
             }
             return true;
    }
}