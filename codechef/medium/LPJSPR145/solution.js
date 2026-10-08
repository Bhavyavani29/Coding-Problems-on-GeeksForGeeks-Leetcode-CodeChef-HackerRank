let N = parseInt(inputChar);

let result = [];
for (let i = 1; i <= N; i++) {
    if (i % 8 !== 0) {
      continue;
    }
    result.push(i);
  }

console.log(result.join(' '));