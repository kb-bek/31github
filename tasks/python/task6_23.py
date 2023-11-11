"""
Дано число N. Найти количество таких чисел в диапазоне [1;N], десятичная запись которых
совпадает с последними цифрами записи их квадрата.
"""

n = int(input())
count = 0

for i in range(1, n + 1):
    square = i ** 2
    str_i = str(i)
    str_square = str(square)

    if str_i[-len(str_i):] == str_square[-len(str_i):]:
        count += 1

print(count)