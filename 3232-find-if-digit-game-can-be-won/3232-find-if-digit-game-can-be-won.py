class Solution(object):
    def canAliceWin(self, nums):
        n1  = 0
        n2 = 0

        for i in nums:
            if i <10:
                n1+=i
            else:
                n2+=i
        
        return False if n1==n2 else True
        