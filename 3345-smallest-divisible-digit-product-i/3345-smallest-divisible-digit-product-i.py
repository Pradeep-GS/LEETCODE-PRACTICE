class Solution(object):
    def smallestNumber(self, n, t):
        def digitSum(k):
            sums=1
            while(k!=0):
                rem = k%10
                sums*=rem
                k=k//10
            return sums
        while True:
            if digitSum(n)%t==0:
                return n
            n+=1

        