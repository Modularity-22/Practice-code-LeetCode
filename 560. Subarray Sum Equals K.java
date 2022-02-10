    class Solution {
        public int subarraySum(int[] nums, int k) {
            if(nums == null || nums.length == 0) return 0;
            int sum = 0, res = 0;
            Map<Integer, Integer> map = new HashMap<>(); //key is prefix sum, value is frequency
            map.put(0, 1);
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                Integer freq = map.get(sum - k);
                if(freq != null) res += freq;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return res;
        }
    }