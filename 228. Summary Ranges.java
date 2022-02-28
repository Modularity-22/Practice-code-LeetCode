class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        Set<Long> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            set.add((long)nums[i]);
        long start = 0;
        long end = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains((long)nums[i] - 1))
                start = nums[i];
            if(!set.contains((long)nums[i] + 1)){
                end = nums[i];
                if(end == start)
                    result.add(start + "");
                else{
                    result.add(start + "->" + end);
                }
            }
        }
        return result;
    }
}