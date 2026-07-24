class Solution(object):
    def numSplits(self, s):
        seen = set()
        n = len(s)
        count = 0
        left = [0]*n
        right = [0]*n

        for i in range(n):
            seen.add(s[i])
            left[i]=len(seen)

        seen.clear()

        for i in range(n-1,-1,-1):
            seen.add(s[i])
            right[i]=len(seen)
        
        for i in range(n-1):
            if left[i]==right[i+1]:
                count+=1
        return count
        