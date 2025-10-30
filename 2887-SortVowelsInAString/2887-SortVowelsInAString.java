// Last updated: 10/30/2025, 11:43:39 PM
import java.util.*;

class Solution {
    public String sortVowels(String s) {
        StringBuilder str = new StringBuilder();
        char[] arrS = s.toCharArray(); 

        for (int i = 0; i < arrS.length; i++) {
            char ch = arrS[i];
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str.append(ch);
                arrS[i] = ' '; 
            }
        }

        char[] arr = str.toString().toCharArray();
        Arrays.sort(arr);

        int index = 0;
        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] == ' ') {
                arrS[i] = arr[index++];
            }
        }

        return new String(arrS); 
    }
}
