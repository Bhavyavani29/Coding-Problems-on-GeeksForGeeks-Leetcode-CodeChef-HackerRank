  let N = parseInt(inputChar);
  
  let largest_even = 0;
  let largest_odd = 1;
  
  for (let i = 1; i <= N; i++) {
    if (i % 2 === 0) {
      largest_even = i;
    } else {
      largest_odd = i;
    }
  }
  
  console.log(largest_even - largest_odd);