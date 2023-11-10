# Дана последовательность целых чисел. 
# Построить новую последовательность, в которой увеличены на 1 элементы первой последовательности, стоящие между первым и вторым положительными числами, третьим и четвертым положительными числами и т.д. 
# Если количество положительных чисел нечетное, то увеличивать на 1 следует также элементы, стоящие после последнего положительного числа.


length_of_nums = int(input())
numbers = [int(x) for x in input().split()]
positive_count = 0

for i in range(len(numbers)):
    if numbers[i] < 0:
        numbers[i] += 1
    else:
        positive_count += 1

if positive_count % 2 != 0:
    for n in range(positive_count + 1, len(numbers)):
        numbers[n] *= 1
        
for j in numbers:
    print(j, end=" ")