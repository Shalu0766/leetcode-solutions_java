class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                int previous = stack.peek();
                stack.push(previous * 2);
            }
            else if(op.equals("+")){
                int last = stack.pop();
                int secondlast = stack.peek();
                stack.push(last);
                stack.push(last + secondlast);
            }
            else{
                stack.push(Integer.parseInt(op));
            }

        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}