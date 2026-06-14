class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(int i = 0; i<buckets.length; i++){
            buckets[i]= new ArrayList<>();
        }

        for(int num : countMap.keySet()){
            int freq = countMap.get(num);
            buckets[freq].add(num);
        }

        int[] res = new int[k];
        int i = 0;

        for(int j = buckets.length-1; j>=0; j--){
            for(int num : buckets[j]){
                res[i++] = num;
                if(i == k){
                    return res;
                }
            }
        }
        return res;
    }
}
