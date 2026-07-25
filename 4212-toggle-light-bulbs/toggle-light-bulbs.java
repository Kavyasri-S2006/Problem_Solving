class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list=new ArrayList<>();
        
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<bulbs.size();i++){
            int x=bulbs.get(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(en.getValue()%2!=0)list.add(en.getKey());
        }
        return list;
    }
}