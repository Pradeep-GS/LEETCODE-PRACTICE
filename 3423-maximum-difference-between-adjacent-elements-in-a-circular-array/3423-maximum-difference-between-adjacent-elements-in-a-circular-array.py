class Solution(object):
    def maxAdjacentDistance(self, nums):
        result = 0
        for i in range(1,len(nums)):
            if abs(nums[i]-nums[i-1])>result:
                result = abs(nums[i]-nums[i-1])
        
        return max(abs(nums[0]-nums[-1]),result)
        