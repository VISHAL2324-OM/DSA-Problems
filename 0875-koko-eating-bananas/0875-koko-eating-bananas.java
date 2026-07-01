class Solution {
    private long ceil(int[]nums , int div){
        int n = nums.length;
        int sum=0;
        for(int i = 0; i<n;i++){
         sum+= Math.ceil((double)nums[i] / (double)(div));
        }
        return sum;
    }
        private int findmax(int [] nums){
int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            maxi = Math.max(maxi , nums[i]);
        }
        return maxi;
    }
    public int minEatingSpeed(int[] nums, int h) {
        
        int low = 1, high = findmax(nums);
        while(low<=high){
            int mid = (low +high)/2;
            long sum = ceil(nums, mid);
            if(sum<=h){
                
                high = mid-1;
                
            } else {
                low= mid+1;
            }
        }
return low;
    }
}