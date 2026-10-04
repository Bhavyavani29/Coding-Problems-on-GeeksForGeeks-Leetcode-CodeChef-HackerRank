let n = parseInt(inputChar);

let largest_even = n;
let largest_odd = n - 1;

if (n % 2 !== 0) {
    largest_even = n - 1;
    largest_odd = n;
}

console.log(largest_even - largest_odd);
