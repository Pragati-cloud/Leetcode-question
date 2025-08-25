class Solution {
    public long numberOfWeeks(int[] milestones) {
        long total =0,max=0;
        for(int i: milestones){
            total +=i;
            max= Math.max(max, i);
        }
        if(max<= total-max+1) return total;
        return (total - max )*2 +1 ;
    }
}
