// Last updated: 11/20/2025, 10:43:37 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(i == '(' || i == '{' || i == '['){
                stack.push(i);
            }
            else if(i == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(i == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(i == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else{
                return false;
            }}
            if(stack.isEmpty()) return true;
            return false;
        

    
}}