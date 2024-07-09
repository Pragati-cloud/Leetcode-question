class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idle=0;
        long wait=0;
        for(int i=0; i<customers.length;i++){
            idle =Math.max(customers[i][0] , idle) +customers[i][1];

            wait += idle -customers[i][0];
        }
        double avgwait = (double) wait/customers.length;
        return avgwait;
    }
}
