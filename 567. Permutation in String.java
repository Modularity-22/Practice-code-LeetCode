class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s2.length() < s1.length()) return false;
        int[] s1Map = new int[26];
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            s1Map[c - 'a']++;
        }
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            int[] s2Map = new int[26];
            for(int j = 0; j < s1.length(); j++){
                char c = s2.charAt(i + j);
                s2Map[c - 'a']++;
            }
            if(compare(s1Map, s2Map)) return true;
        }
        return false;
    }
    private static boolean compare(int[] a, int[] b){
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i]) return false;
        return true;
    }
}