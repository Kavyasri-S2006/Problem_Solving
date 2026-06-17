class Solution {
    public String processStr(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')res+=ch;
            if(ch=='*'&& res.length()>0)res=res.substring(0,res.length()-1);
            if(ch=='#')res+=res;
            if(ch=='%'){
                String st="";
            for(int j=res.length()-1;j>=0;j--){
                char c=res.charAt(j);
                st+=c;
            }
            res=st;
            }
        }
        return res;
    }
}