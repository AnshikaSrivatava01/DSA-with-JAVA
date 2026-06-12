class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int res = 0;
    
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j=i; j<n; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt > n/2)
            res = nums[i];
        }
        return res;
    }
}