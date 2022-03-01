class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 0; i <= num; i++)
            res[i] = check(i);
        return res;
    }
    private int check(int n){
        int res = 0;
        while(n != 0){
            if((n & 1) == 1) res++;
            n >>= 1;
        }
        return res;
    }
}