    const n = parseInt(line);

// Function to check if a number is prime
    function isPrime(x) {
    if (x <= 1) return false;
    if (x <= 3) return true;
    if (x % 2 === 0 || x % 3 === 0) return false;

    let i = 5;
    while (i * i <= x) {
        if (x % i === 0 || x % (i + 2) === 0) return false;
        i += 6;
    }

    return true;
}

// Function to print prime numbers between l and r (inclusive)
function printPrimes(l, r) {
    let result = [];
    for (let i = l; i <= r; i++) {
        if (isPrime(i)) {
            result.push(i);
        }
    }
    console.log(result.join(' '));
}

    printPrimes(n, 5 * n);