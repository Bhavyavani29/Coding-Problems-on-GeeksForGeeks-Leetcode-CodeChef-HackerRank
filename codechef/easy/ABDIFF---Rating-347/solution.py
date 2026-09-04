a,b = map(int,input().split())

# write your code here
x = a + b
y = a * b
if(y >= x):
    print(y - x)
else:
    print(x - y)
