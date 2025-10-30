// Last updated: 10/30/2025, 11:42:59 PM
class Solution {
    public boolean hasSameDigits(String s) {
        ArrayList<Integer> alistog = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            alistog.add(s.charAt(i)-'0');
        }
        ArrayList<Integer> alistref = new ArrayList<>();
        while(alistog.size() != 2){
        int i = 0;
        int j = 1;
            while(j < alistog.size()){
            int num1 = alistog.get(i);
            int num2 = alistog.get(j);
            int val = (num1+num2)%10;
            alistref.add(val);
            i++;j++;
        }
        alistog.clear();
        for(int k = 0; k < alistref.size(); k++){
            alistog.add(alistref.get(k));
        }
        alistref.clear();
        }
        if(alistog.get(0) == alistog.get(1)) return true; 
        return false;

    }
}