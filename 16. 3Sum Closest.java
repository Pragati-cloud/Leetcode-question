class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=0 , sum=0, n= nums.length , max= Integer.MAX_VALUE/2;
        for(int i=0;i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                sum = nums[i]+ nums[j] +nums[k];
                if(sum == target) return target;

                if(Math.abs(sum- target) < Math.abs(max -target)) max = sum;
                
                if(sum <target) j++;
                else k--;
                
            }
        }return max;

        
    }
}
