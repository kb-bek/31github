class Solution:
    def isPalindrome(self, s: str) -> bool:
        symbols = '!@#$%^&*():;,><.{}[]\/||-_"`~\'? '
        res = ''
        for i in s:
            if i in symbols:
                continue
            res += i
        if res.lower() == res[::-1].lower():
            return True
        else:
            return False
