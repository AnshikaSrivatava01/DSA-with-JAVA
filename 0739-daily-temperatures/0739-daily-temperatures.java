class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int prev = stack.pop();
                res[prev] = i-prev;
            }
            stack.push(i);
        }
        return res;
    }
}
