class Solution {
    public void reverseString(char[] s) {
        int low = 0,high = s.length - 1;
        while(low < high){
            swap(s,low++, high--);
        }
        
    }
    private void swap(char[] s, int a, int b){
        char temp = s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}