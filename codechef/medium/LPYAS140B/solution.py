def calculate_simple_interest(P, T, R):
    # Complete the function
    return (P * T * R) / 100
    

def main():
    P, T, R = map(int, input().split())
    # call the calculate_simple_interest function and print the result
    result = calculate_simple_interest(P, T, R)
    print(result);

main()
