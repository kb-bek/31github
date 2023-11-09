# аi бутун сандардын ыраттуулугу берилди. bi элементи а1 ден аi га чейинки элементтердин арифметикалык орточосуна барабар болгон bi жаны ыраттуулугун тузгуло.


length_of_nums = int(input())
ai = [int(x) for x in input().split()]

n = len(ai)
bi = [0] * n
sum_ai = 0

for i in range(n):
    sum_ai += ai[i]
    bi[i] = sum_ai / (i + 1)

for i in bi:
    print(int(i), end=" ")
