class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int number = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }
            else if (ch == '['){
                countStack.push(number);
                stringStack.push(currentString);
                number = 0;
                currentString = "";
            }

            else if (ch == ']'){
                int count = countStack.pop();
                String previousString = stringStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int j = 0; j < count; j++){
                    temp.append(currentString);
                }
                currentString = previousString + temp.toString();
            }
            else{
                currentString += ch;
            }
        }  
        return currentString;
    }
}