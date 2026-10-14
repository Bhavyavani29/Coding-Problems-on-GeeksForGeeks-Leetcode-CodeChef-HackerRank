const base = parseInt(input);

// Function to calculate power
function calculatePower(base) {
    let ans = 1;
    for (let i = 0; i < 10; i++) {
        ans *= base;
    }
    return ans;
}


console.log(calculatePower(base));