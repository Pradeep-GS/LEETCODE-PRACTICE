class Solution(object):
    def valid(self,s):
        k = set()

        for i in s:
            if i in k:
                return False
            k.add(i)
        return True
    def countGoodSubstrings(self, s):
        lis = []
        for i in range(0,len(s)-2):
            lis.append(s[i:i+3])
        count =0
        for l in lis:
            if self.valid(l):
                count+=1
        return count
        