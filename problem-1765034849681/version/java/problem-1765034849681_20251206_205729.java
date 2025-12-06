// Last updated: 12/6/2025, 8:57:29 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int[] sol = new int[nums.length];
4        int n = nums.length;
5        for(int i = 0; i < n; i++){
6            if(isPalindrome(nums[i])){
7                sol[i] = 0;
8                continue;
9            }
10            int near = findNearestPalindrome(nums[i]);
11            sol[i] = Math.abs(nums[i] - near);
12              
13        }
14        return sol;
15    }
16    boolean isPalindrome(int num){
17        String s = Integer.toBinaryString(num);
18        int pt1 = 0;
19        int pt2 = s.length()-1;
20        while(pt1 < pt2){
21            if(s.charAt(pt1) != s.charAt(pt2)){
22                return false;
23            }
24            pt1++;
25            pt2--;
26        }
27        return true;
28    }
29    
30    int findNearestPalindrome(int num){
31        for(int diff = 1; ; diff++){
32            int lower = num-diff;
33            int high = num+diff;
34            boolean lowPal = lower >= 0 && isPalindrome(lower);
35            boolean highPal = isPalindrome(high);
36            if(lowPal) return lower;
37            if(highPal) return high;
38        }
39    }
40    
41}