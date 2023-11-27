class Solution:
    def reverseWords(self, s: str) -> str:
        string_list = s.split()

        for i, j in zip(string_list, range(len(string_list))):
            reversedstr = ''
            k = len(i)-1
            for l in range(len(i)):
                reversedstr += i[k]
                k -= 1
            string_list[j] = reversedstr

        return ' '.join(string_list)