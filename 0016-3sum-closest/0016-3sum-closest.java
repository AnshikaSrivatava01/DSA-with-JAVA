class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int clSum = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length; i++) {
            int l = i+1;
            int r = nums.length-1;

            while(l<r) {
                int crtSum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-crtSum) < Math.abs(target-clSum)){
                    clSum = crtSum;
                }

                if(crtSum < target) {
                    l++;
                }
                else if(crtSum > target) {
                    r--;
                }
                else {
                    return crtSum;
                }
            }
        }
    return clSum;
    }
}