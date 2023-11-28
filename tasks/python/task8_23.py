n, n2 = map(int, input().split())
nums = [list(map(int, input().split())) for _ in range(n)]
sorted_nums = []

for i in range(n):
    for j in range(n2):
        sorted_nums.append(nums[i][j])
print(*sorted_nums)