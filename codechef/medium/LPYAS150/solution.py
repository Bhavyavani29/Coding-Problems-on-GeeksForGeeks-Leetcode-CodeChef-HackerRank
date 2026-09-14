def is_even(num):
    return num % 2 == 0

def main():
    t = int(input())
    for _ in range(t):
        num = int(input())
        if is_even(num):
            print("Even")
        else:
            print("Odd")

if __name__ == "__main__":
    main()
