class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)freq[s.charAt(i)-'a']++;
        int dec=0;
        //int val=0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<freq.length;i++){
                while(freq[i]!=0 && st.contains(freq[i])){
                    freq[i]--;
                    dec++;
                }
                st.add(freq[i]);
            }
        return dec;

    }
}