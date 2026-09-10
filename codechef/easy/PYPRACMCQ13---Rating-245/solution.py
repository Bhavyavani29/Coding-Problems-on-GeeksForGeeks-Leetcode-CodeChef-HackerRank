t = int(input())
for i in range(0,t):
    x,y,a = map(int,input().split())
    # write your code here
    if(a >= x and a < y):
        print("YES")
    else:
        print("NO")