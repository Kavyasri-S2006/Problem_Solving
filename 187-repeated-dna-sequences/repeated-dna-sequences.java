class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        int l=0;
        int r=l+9;
        List<String> list=new ArrayList<>();
        String st="";
        while(r<s.length()){
            st=s.substring(l,r+1);
            map.put(st,map.getOrDefault(st,0)+1);
            l++;
            r++;
        }
        for(Map.Entry<String,Integer> en:map.entrySet()){
            if(!list.contains(en.getKey()) && en.getValue()>1 )list.add(en.getKey());
        }
        return list;
    }
}