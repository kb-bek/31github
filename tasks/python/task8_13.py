n, n2 = map(int, input().split())
nums = [list(map(int, input().split())) for _ in range(n)]
all_sum = []
equals = True
for i in range(len(nums)):
    all_sum.append(sum(nums[i]))

for j in range(len(all_sum)-1):
    if nums[j] != nums[j+1]:
        equals = False
        break
print(equals)