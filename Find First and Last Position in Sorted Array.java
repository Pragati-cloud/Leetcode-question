class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] result = {-1, -1};
        int left = bs(nums, target, true);
        int right = bs(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;        
    }
    private int bs(int[] nums, int target ,boolean isFindLeft){
        int count =-1;
        int high= nums.length-1 , low =0;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(nums[mid]> target){
                 high=mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                count = mid;
                if(isFindLeft){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }return count;
    }
}
