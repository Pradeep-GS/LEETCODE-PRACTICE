class Solution(object):
    def maxDistinct(self, s):
        seen = set()
        for i in s:
            seen.add(i)
        return len(seen)
        