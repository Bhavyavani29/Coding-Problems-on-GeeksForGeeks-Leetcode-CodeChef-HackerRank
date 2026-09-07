# Enter the value of N
N = int(input())

# Initialize the sum
total_sum = 0

# Calculate the sum of the first N multiples of 3
for i in range(1, N + 1):
    total_sum += 3 * i

# Print the sum
print(total_sum)
