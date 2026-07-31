class Solution(object):
    def maximum69Number(self, num):
        maxNum = num
        lis = list(str(num))

        for i in range(len(lis)):
            original = lis[i]
            lis[i] = '6' if lis[i] == '9' else '9'
            string = "".join(lis)
            maxNum = max(maxNum, int(string))
            lis[i] = original

        return maxNum