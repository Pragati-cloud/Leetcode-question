class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> Mp = new HashMap<>();
        int[] res= new int[k];

        for(int num :nums){
            Mp.put(num, Mp.getOrDefault(num,0)+1);

        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(Map.Entry<Integer,Integer> entry :Mp.entrySet()){
            pq.add(new int[]{entry.getValue(),entry.getKey()});
        }
        for(int i=0;i<k;i++){
            res[i]= pq.poll()[1];
        }
        return res;
    }
}
