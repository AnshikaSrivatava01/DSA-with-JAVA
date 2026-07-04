class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r= 0;
        for(int pile : piles){
            r = Math.max(r, pile);
        }

        int res = r;

        while(l<=r){
            int mid = l+(r-l) / 2 ;
            long totalhrs = 0;
            for(int pile : piles){
                totalhrs += (pile +mid - 1) /mid;
            }

            if(totalhrs <= h){
                res = mid;
                r = mid -1;
            }

            else{
                l = mid+1;
            }
        }
        return res;
    }
}
