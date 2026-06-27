class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        backtrack(nums, currentPermutation, res);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result){
    if (currentPermutation.size() == nums.length) {
       result.add(new ArrayList<>(currentPermutation));
            return;
        } 
        for (int i = 0; i < nums.length; i++) {
            if (currentPermutation.contains(nums[i])) {
                continue; 
            }
            currentPermutation.add(nums[i]);
            backtrack(nums, currentPermutation, result);
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }
}