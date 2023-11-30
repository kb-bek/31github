class Solution:
    def countSegments(self, s: str) -> int:
        tolist = s.split()
        count = 0
        for i in tolist:
            count += 1
        return count
