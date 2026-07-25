class Solution(object):
    def maxProduct(self, n):
        mul = -1
        lis = list(str(n))
        print(lis)

        for i in range(0,len(lis)):
            m = int(lis[i])
            for j in range(i+1,len(lis)):
                o = int(lis[j])
                mul = max(mul,m*o)
        return mul if mul!=-1 else 0