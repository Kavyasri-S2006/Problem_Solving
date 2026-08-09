class Solution {
    public boolean isPalindrome(String s) {
    //StringBuilder sb=new StringBuilder();
    String s1="";
    String s2="";
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isLetterOrDigit(c))s1+=String.valueOf(Character.toLowerCase(c));
    }
     StringBuilder sb=new StringBuilder(s1);
     s2=String.valueOf(sb.reverse());
    return s1.equals(s2);
    }
}