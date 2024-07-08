class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> cq = new LinkedList<Integer>();
        for(int i=1; i<=n ;i++){
            cq.add(i);
        }
        while(cq.size() >1){
            for(int i=0; i<k-1 ;i++){
                cq.add(cq.remove());
            }
            cq.remove();
        }return cq.peek();
    }
}
