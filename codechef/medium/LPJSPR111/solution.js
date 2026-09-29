// Corrected code to calculate the summation of lengths of arrays a, b, and c

// Define arrays a, b, and c
let a = [1, 2, 3];
let b = [4, 5, 6];
let c = [7, 8, 9, ...b]; // Spread operator to combine b into c

// Calculate lengths of arrays
let lengthA = a.length;
let lengthB = b.length;
let lengthC = c.length;

// Print the summation of lengths
console.log(lengthA + lengthB + lengthC);
