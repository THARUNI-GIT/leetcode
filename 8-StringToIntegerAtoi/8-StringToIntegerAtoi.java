// Last updated: 8/24/2026, 8:09:21 PM
class Solution {
    public int myAtoi(String s) {
        String str = s.stripLeading();
        if(str.length() == 0) return 0;
        StringBuilder newstr = new StringBuilder();
            if(str.charAt(0) == '+' || str.charAt(0) == '-' || (str.charAt(0) <= '9' && str.charAt(0) >= '0')){
            newstr.append(str.charAt(0));
        }
        else{
            return 0;
        }
        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                newstr.append(ch);
            }
            else{
                break;
            }
        }
        if(newstr.toString().equals("+") || 
   newstr.toString().equals("-"))
    return 0;
    
        double num = Double.parseDouble(newstr.toString());
       if(num > Integer.MAX_VALUE)
    return Integer.MAX_VALUE;

if(num < Integer.MIN_VALUE)
    return Integer.MIN_VALUE;
        return (int) num;
    }
}