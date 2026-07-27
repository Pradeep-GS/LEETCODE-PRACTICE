class Solution(object):
    def maxProduct(self, nums):
        n = len(nums)
        lis = sorted(nums)
        ans = (lis[n-1]-1)*(lis[n-2]-1)
        return ans
        