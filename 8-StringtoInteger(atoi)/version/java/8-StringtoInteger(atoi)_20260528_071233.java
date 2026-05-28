// Last updated: 5/28/2026, 7:12:33 AM
1class Solution {
2    public int myAtoi(String s) {
3        String str = s.stripLeading();
4        if(str.length() == 0) return 0;
5        StringBuilder newstr = new StringBuilder();
6            if(str.charAt(0) == '+' || str.charAt(0) == '-' || (str.charAt(0) <= '9' && str.charAt(0) >= '0')){
7            newstr.append(str.charAt(0));
8        }
9        else{
10            return 0;
11        }
12        for(int i = 1; i < str.length(); i++){
13            char ch = str.charAt(i);
14            if(ch >= '0' && ch <= '9'){
15                newstr.append(ch);
16            }
17            else{
18                break;
19            }
20        }
21        if(newstr.toString().equals("+") || 
22   newstr.toString().equals("-"))
23    return 0;
24    
25        double num = Double.parseDouble(newstr.toString());
26       if(num > Integer.MAX_VALUE)
27    return Integer.MAX_VALUE;
28
29if(num < Integer.MIN_VALUE)
30    return Integer.MIN_VALUE;
31        return (int) num;
32    }
33}