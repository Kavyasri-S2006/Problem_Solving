class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int[] in:intervals){
            if(!pq.isEmpty() && pq.peek()<in[0]) {
                pq.poll();
            }
            pq.offer(in[1]);
        }
        return pq.size();
    }
}