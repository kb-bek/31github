length_num = int(input())
numbers = [int(i) for i in input().split()]
summa = 0

for i in range(length_num-1):
    summa += (numbers[i] - numbers[i+1]) * (numbers[i] - numbers[i+1])
print(summa)