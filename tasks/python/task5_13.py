# Фибоначчинин ыраттууулугу төмөндөгүдөй аныкталат: биринчи эки мүчөсү 1ге барабар,калгандары болсо мурунку 2мүчөлөрдүн суммаларына барабар. 
# Б.а Фибоначчинин сандары 1,1,2,3,5,8,13,...болуп саналат. аi бүтүн санынын ыраттуулугу берилди.Берилген ырааттуулуктагы Фибоначчи сандарынан турган жаңы ыраттуулукту түзгүлө .

length_of_nums = int(input())
numbers = [int(x) for x in input().split()]
n = max(numbers)
fib_numbers = [0, 1]

for i in range(2, n+1):
    fib_numbers.append(fib_numbers[i-1] + fib_numbers[i-2])
    if fib_numbers[i-1] + fib_numbers[i-2] > n:
        break

for i in numbers:
    if i in fib_numbers:
        print(i, end=" ")