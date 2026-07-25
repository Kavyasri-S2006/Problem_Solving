class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list=new ArrayList<>();
        int[] freq=new int[101];
        for(int i=0;i<bulbs.size();i++)freq[bulbs.get(i)]++;
        for(int i=0;i<freq.length;i++){
            if( freq[i] %2  != 0)list.add(i);
        }
        return list;
        // Map<Integer,Integer> map=new TreeMap<>();
        // for(int i=0;i<bulbs.size();i++){
        //     int x=bulbs.get(i);
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> en:map.entrySet()){
        //     if(en.getValue()%2!=0)list.add(en.getKey());
        // }
        // return list;
    }
}