class Solution(object):
    def minSteps(self, s, t):
        dic = {}

        for i in t:
            dic[i]  = dic.get(i,0)+1
        for k in s:
            if k in dic:
                dic[k] = dic.get(k)-1
        count = 0

        for l in dic.values():
            if l>0:
                count+=l
        print(count)
        return count
        