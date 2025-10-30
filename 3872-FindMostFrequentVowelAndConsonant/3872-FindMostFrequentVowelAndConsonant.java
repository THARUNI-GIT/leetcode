// Last updated: 10/30/2025, 11:43:05 PM
class Solution {
    public int maxFreqSum(String s) {
       /* HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
         vowels.put(s.charAt(i),vowels.getOrDefault(s.charAt(i),0)+1);
            }
        else{
              consonants.put(s.charAt(i),consonants.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int vowel = 0;
        int cons = 0;
        if(!vowels.isEmpty()){
            vowel = Collections.max(vowels.values());
        }
        if(!consonants.isEmpty()){
            cons = Collections.max(consonants.values());
        }
     
        return vowel+cons;*/
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        int vowelsmax = 0;
        int consmax = 0;
        for(int i=0; i<arr.length; i++){
            
            if((i==0||i==4||i==8||i==14||i==20) && arr[i]>vowelsmax){
                vowelsmax=arr[i];
            }
            else if((i!=0 && i!=4 && i!=8 && i!=14 && i!=20) && arr[i]>consmax){
                consmax=arr[i];
            }
        }
        return vowelsmax+consmax;

        
    }
}