class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int crtSum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++) {
            crtSum += nums[r];
            
            while(crtSum >= target) {
                minLen = Math.min(minLen, r - l + 1);
                crtSum -= nums[l];
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}