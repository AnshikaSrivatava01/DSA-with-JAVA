class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l<r) {
            int crtSum = nums[l] + nums[r];
            if(crtSum > target){
                r--;
            }else if(crtSum < target) {
                l++;
            }else {
                return new int[] {l+1, r+1};
            }
        }
        return new int[0];
    }
}
