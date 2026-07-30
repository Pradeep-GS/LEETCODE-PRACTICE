class Solution(object):
    def maxVowels(self, s, k):
        count = 0
        v = "aeiouAEIOU"

        for i in range(k):
            if s[i] in v:
                count += 1

        max_count = count

        for j in range(k, len(s)):
            prev = s[j - k]
            curr = s[j]

            if prev in v:
                count -= 1

            if curr in v:
                count += 1

            max_count = max(max_count, count)

        return max_count