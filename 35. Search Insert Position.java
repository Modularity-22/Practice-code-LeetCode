class Solution {
    public int searchInsert(int[] a, int target) {
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] >= target)
                return i;
        }
        return n;
    }
}