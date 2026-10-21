class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
              stack.pop();
            }else{
            stack.push(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(char ch : stack){
            result.append(ch);
        }
        return result.toString();
    }
}