class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i< nums.length; i++){
            ans.add(nums[i]);
        }
        if (ans.size() == nums.length){
            return false;
        }
        else {
            return true;
        }
    }
}