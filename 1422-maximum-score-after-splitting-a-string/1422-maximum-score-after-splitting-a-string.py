class Solution(object):
    def maxScore(self, s):
        max_score = float('-inf')
        for i in range(1,len(s)):
            right = s[i:]
            left = s[:i]
            print(left,right)

            score = self.zero(left)+self.one(right)
            print(score)
            max_score = max(max_score,score)
        return max_score
    
    def zero(self,n):
        count = 0
        for i in n:
            if i=='0':
                count+=1
        return count
    
    def one(self,n):
        count = 0
        for i in n:
            if i=='1':
                count+=1
        return count