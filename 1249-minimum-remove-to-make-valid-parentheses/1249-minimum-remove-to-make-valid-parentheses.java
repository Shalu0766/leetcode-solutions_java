class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        int close = 0;
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
                flag += 1;
            }else if(s.charAt(i) == ')' && flag > 0){
                close++;
                flag--;
            }
        }
        int k = Math.min(open, close);
        String ans = "";
        open = k;
        close = k;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(open > 0){
                    ans += '(';
                    open--;
                }
                continue;
            }
            if(s.charAt(i) == ')'){
                if(close > 0 && close > open){
                    ans += ')';
                    close--;
                }
                continue;
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}