class Solution(object):
    def findMissingElements(self, nums):
        lis = []
        minNum = min(nums)
        maxNum = max(nums)

        for i in range(minNum,maxNum+1):
            if i not in nums:
                lis.append(i)

        return lis
        