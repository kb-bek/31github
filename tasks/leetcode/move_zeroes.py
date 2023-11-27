

numbers = [3, 43, 0, 23, 0, 22]
index = 0

for i in numbers:
    if i != 0:
        numbers[index] = i
        index += 1

while index < len(numbers):
    numbers[index] = 0
    index += 1
print(numbers)