# Дано число N. Найти сумму его простых сомножителей.

n = int(input())
divisor = 2
summa = 0
while n > 1:
    if n % divisor == 0:
        while n % divisor == 0:
            summa += divisor
            n //= divisor
    divisor += 1

print(summa)