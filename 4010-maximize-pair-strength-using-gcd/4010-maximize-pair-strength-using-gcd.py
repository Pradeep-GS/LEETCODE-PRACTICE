
class Solution(object):
    def maxPairStrength(self, nums):
        ans = 0
        def gcd(a,b):
            while(a!=0):
                a,b=b%a,a
            return b
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                g = gcd(nums[i], nums[j])
                ans = max(ans, (nums[i] * nums[j]) // (g * g))

        return ans