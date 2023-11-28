n = int(input())
strings = []
for i in range(n):
    some_str = input()
    strings.append(some_str)

def Add(string):
    return string + string[::-1]

for i in strings:
    print(Add(i))