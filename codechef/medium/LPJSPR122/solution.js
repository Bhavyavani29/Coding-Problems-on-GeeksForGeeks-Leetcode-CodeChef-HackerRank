    let x = parseInt(inputChar);
    let ans = 1; // Factorial of x will be stored in ans
    let i = 1;   // Start from 1

    while (i <= x) {
        ans *= i; // Multiply ans by the current value of i
        i++;      // Increment i by 1
    }

    console.log(ans);