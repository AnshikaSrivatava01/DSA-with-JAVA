class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for(int i=n/2-1; i>=0; i--){
            heapify(nums, n, i);
        }
        for(int i=n-1; i>0; i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i, 0);
        }
        return nums;
    }
    private void heapify(int[] arr, int n, int i){
            int max = i;
            int l = 2*i+1;
            int r = 2*i+2;
            if(l<n && arr[l]>arr[max]) max = l;
            if(r<n && arr[r]>arr[max]) max = r;

            if(max != i){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
                heapify(arr, n , max);
            }
        }
}    

