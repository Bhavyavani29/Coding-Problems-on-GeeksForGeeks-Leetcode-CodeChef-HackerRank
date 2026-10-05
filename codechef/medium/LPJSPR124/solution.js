 let N = parseInt(inputChar); 

 let sumOfDigits = 0;
    let productOfDigits = 1;

    while (N > 0) {
        let digit = N % 10;  // Get the last digit
        sumOfDigits += digit;  // Add the digit to sum
        productOfDigits *= digit;  // Multiply the digit to product
        N = Math.floor(N / 10);  // Remove the last digit
    }

    console.log(sumOfDigits,productOfDigits);