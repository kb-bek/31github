#Дано число N. Найти сумму простых делителей числа N.

n = int(input())
divisors_sum = 0

prime_nums = []
k = 0
for i in range(2, n+1):
    for j in range(2, i):
        if i % j == 0:
            k = k + 1
    if k == 0:
        prime_nums.append(i)
    else:
        k = 0
for divisor in range(2, n):
    if n % divisor == 0 and divisor in prime_nums:
        divisors_sum += divisor

print(divisors_sum)
