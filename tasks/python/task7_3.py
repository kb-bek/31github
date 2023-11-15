from math import sqrt

length_num = int(input())
numbers = [int(i) for i in input().split()]
summa = 0

for i in numbers:
    summa += i * i
print("{:.2f}".format(sqrt(summa)))