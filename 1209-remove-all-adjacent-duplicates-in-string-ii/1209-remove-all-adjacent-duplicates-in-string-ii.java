class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (char ch : s.toCharArray()){
            if(st.size() > 0 && st.peek() == ch){
                count.push(count.peek() + 1);
            }else{
                count.push(1);
            }
            st.push(ch);
            if(count.peek() == k){
                for (int i = 0; i < k; i++){
                    st.pop();
                    count.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}