values = list(map(int, input().split()))
# Update your code below this line
for i, num in enumerate(values):
    if num > 10:
        continue
    print(num * num)