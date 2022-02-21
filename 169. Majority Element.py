class Solution:
    import statistics
    def majorityElement(self, nums: List[int]) -> int:
        return (statistics.mode(nums))
        