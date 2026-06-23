class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // int ans[] = new int [2];
        // for(int i = 0; i < n ; i++){
        //     for(int j = i=1; j<n; j++){
        //         if(nums[i]+nums[j] == target){
        //             ans[0] =i;
        //             ans[1] =j;
        //             return ans;

        //         }
        //     }
        // }
        // return new int[] {-1,-1};
        HashMap<Integer,Integer> Mpp = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            int number = nums[i];
            int more = target - number;
            if(Mpp.containsKey(more)){
                return new int[]{Mpp.get(more),i};
            }
            Mpp.put(nums[i],i);

        }
    return new int[]{-1,-1};
   
    }
}