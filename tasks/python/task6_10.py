s = int(input())
sandar = [int(n) for n in input().split()]
lst = []

for i in sandar:
    if sandar.count(i) > 1:
        lst.append(i)

if len(lst) == 0:
    print(min(sandar))
else:
    print(min(lst))