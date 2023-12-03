class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ''
        s_lst = []

        for i in s:
            s_lst.append(i)
            if i.lower() in 'iouae':
                vowels += i
        j = 0
        for i in range(len(s_lst)):
            if s_lst[i].lower() in 'iouae':
                s_lst[i] = vowels[::-1][j]
                j += 1
        return ''.join(s_lst)