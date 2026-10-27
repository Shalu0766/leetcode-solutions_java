class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char ch : num.toCharArray()){
            while(k != 0 && !stack.isEmpty() && stack.peek() > ch){
                stack.pop();
                k--;
            }
            if(!stack.isEmpty() || ch != '0'){
                stack.push(ch);
            }
        }

        while(k-- > 0 && !stack.isEmpty()){
            stack.pop();
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        String ans = res.reverse().toString();
        return ans == "" ? "0" : ans;
    }
}