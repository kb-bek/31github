class Solution:
    def reverseString(self, s: List[str]) -> None:
        j = len(s) - 1
        copylst = []
        reversedlst = []
        for i in s:
            copylst.append(i)
        for i in range(len(s)):
            reversedlst.append(copylst[j])
            s[i] = reversedlst[i]
            j -= 1
