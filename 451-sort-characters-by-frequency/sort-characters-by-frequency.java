class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> p = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        p.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!p.isEmpty()){
            Map.Entry<Character, Integer> m = p.poll();

            for(int i=0;i<m.getValue();i++){
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}