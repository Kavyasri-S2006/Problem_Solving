class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        boolean res=false;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<word1.length();i++){
            if(word2.contains(String.valueOf(word1.charAt(i))))res=true;
            else return false;
        }
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=0 && freq2[i]!=0){
                if(freq1[i]==freq2[i]) res=true;
                else{ res=false; break;}
            } 
            
             

        }
        return res;
    }
}