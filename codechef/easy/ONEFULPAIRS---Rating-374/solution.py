a,b = map(int,input().split())

# write your code here
oneFulPair = a + b + (a * b)
if(oneFulPair == 111):
    print("YES")
else:
    print("NO")