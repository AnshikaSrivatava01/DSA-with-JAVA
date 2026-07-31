class Solution {
    public void sortColors(int[] arr) {
       int n = arr.length;
        int low = 0;
        int mid = 0;
        int hi = n-1;
        while (mid <= hi){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                swap(arr, mid, hi); 
                hi--;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}