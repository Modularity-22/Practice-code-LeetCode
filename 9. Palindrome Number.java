class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        List l = new ArrayList();
        while(x/10 != 0){
            l.add(x % 10);
            x /= 10;
        }
        if(x % 10 != 0){
            l.add(x%10);
        }
        int len = l.size();
        for(int i = 0; i < len/2; i++){
            if(l.get(i) != l.get(len-i-1)){
                return false;
            }
        }
        return true;
    }
}