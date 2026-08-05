class Solution {
    public int totalFruit(int[] fruits) {
        int[] count = new int[100001];
        int l = 0;
        int maxFru = 0;
        int type = 0;
        for(int r = 0; r < fruits.length; r++){
           if(count[fruits[r]] == 0) {
            type++;
           }
           count[fruits[r]]++;
           while(type > 2) {
            count[fruits[l]]--;
            if(count[fruits[l]]==0) {
                type--;
            }
           
           l++;
        }
        maxFru = Math.max(maxFru, r-l+1);
    }
    return maxFru;
    }
}