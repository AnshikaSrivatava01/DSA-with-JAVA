class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = l+1;
            }else{
                r = r-1;
            }
        }
        return -1;
    }
}