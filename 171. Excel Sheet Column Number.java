class Solution {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result *= 26;
            int c = s.charAt(i) - 'A' + 1;
            result += c;
        }
        return result;
    }
}