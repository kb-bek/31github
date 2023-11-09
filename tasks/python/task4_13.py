
# Вводится число N. Найти количество пар различных чисел, лежащих в интервале от 2 до N,
# у которых суммы делителей (не включая сами числа) одинаковы. Пары, отличающиеся только
# порядком чисел, считаются одинаковыми.

n = int(input())
count = 0

for num1 in range(2, n + 1):
    for num2 in range(num1 + 1, n + 1):
        sum1, sum2 = 1, 1 

        for i in range(2, num1 // 2 + 1):
            if num1 % i == 0:
                sum1 += i

        for i in range(2, num2 // 2 + 1):
            if num2 % i == 0:
                sum2 += i

        if sum1 == sum2:
            count += 1

print(count)
