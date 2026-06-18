class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n = numbers.length;
       int l = 0, r = n-1;
       
       while(l<r){
           int crtsum = numbers[l]+numbers[r];
           if( crtsum == target){
              return new int[] { l+1, r+1};
            }
            else if(crtsum < target){
              l++;
            }
            else {
              r--;
            }
        }
       return new int[] {};
    }
}
