// Last updated: 11/20/2025, 10:41:48 PM
class Solution {
    public int minOperations(int[] nums) {
      Stack<Integer> stack = new Stack<>();
      int res = 0;
      for(int i : nums){
        while(!stack.isEmpty() && stack.peek() > i){
            stack.pop();}
            if(i == 0){
                continue;
            }
            if(stack.isEmpty() || stack.peek() < i){
                res++;
                stack.push(i);
            }
        
       
      }
       return res;}}
