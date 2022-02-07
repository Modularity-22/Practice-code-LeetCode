class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int len = nums.length;
        k = k % len;
        int[] temp = new int[k];
        int i = len - k;
        for(; i < len; i++)
            temp[i - (len - k)] = nums[i];
        for(i = len - k - 1; i >= 0; i--)
            nums[i + k] = nums[i];
        for(i = 0; i < k; i++)
            nums[i] = temp[i];
    }
}