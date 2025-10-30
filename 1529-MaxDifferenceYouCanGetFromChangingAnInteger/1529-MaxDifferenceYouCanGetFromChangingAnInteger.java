// Last updated: 10/30/2025, 11:44:17 PM
class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        
        // For maximum number
        char[] maxChars = s.toCharArray();
        for (int i = 0; i < maxChars.length; i++) {
            if (maxChars[i] != '9') {
                char toReplace = maxChars[i];
                for (int j = 0; j < maxChars.length; j++) {
                    if (maxChars[j] == toReplace) {
                        maxChars[j] = '9';
                    }
                }
                break;
            }
        }
        int maxNum = Integer.parseInt(new String(maxChars));
        
        // For minimum number
        char[] minChars = s.toCharArray();
        if (minChars[0] != '1') {
            char toReplace = minChars[0];
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == toReplace) {
                    minChars[i] = '1';
                }
            }
        } else {
            for (int i = 1; i < minChars.length; i++) {
                if (minChars[i] != '0' && minChars[i] != '1') {
                    char toReplace = minChars[i];
                    for (int j = 0; j < minChars.length; j++) {
                        if (minChars[j] == toReplace) {
                            minChars[j] = '0';
                        }
                    }
                    break;
                }
            }
        }
        int minNum = Integer.parseInt(new String(minChars));
        
        return maxNum - minNum;
    }
}
