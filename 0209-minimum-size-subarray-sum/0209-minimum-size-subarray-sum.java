class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int minLength = Integer.MAX_VALUE;

        int[] prefix = new int[n+1];
        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }

        for(int i =0; i<n; i++) {
            int needed = target + prefix[i];
            int idx = Arrays.binarySearch(prefix, needed);

            if(idx < 0) {
                idx = -idx -1;
            }
            if(idx <= n) {
                minLength = Math.min(minLength, idx - i);
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}