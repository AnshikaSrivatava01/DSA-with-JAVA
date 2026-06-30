class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
       
        for(int i = 0; i< tokens.length; i++){
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int res = 0;

                if(tokens[i].equals("+")){
                    res = op1 + op2;
                }
               else if(tokens[i].equals("-")){
                    res = op1 - op2;
                }
                else if(tokens[i].equals("*")){
                    res = op1 * op2;
                }
                else if(tokens[i].equals("/")){
                    res = op1 / op2; 
                }
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
            
        }
        return stack.pop();
    }
}
