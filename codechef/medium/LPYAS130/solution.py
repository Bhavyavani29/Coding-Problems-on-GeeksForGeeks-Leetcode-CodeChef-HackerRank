numbers = list(map(int, input().split()))
# Update your code below this line
for i, num in enumerate(numbers):
    if num == 8:
        print(i)
        break