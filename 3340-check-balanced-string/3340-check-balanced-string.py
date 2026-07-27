class Solution(object):
    def isBalanced(self, num):
        even = 0
        odd = 0
        for i , val in enumerate(num):
            if i%2==0:
                even+=int(val)
            else:
                odd+=int(val)
        return odd==even
        