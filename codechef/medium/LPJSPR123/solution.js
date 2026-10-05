  let N = parseInt(inputChar);
  
  let digitCount = 0;
  
  while(N > 0){
    digitCount++;
    N = Math.floor(N / 10); // Use Math.floor to ensure N is an integer after division
  }
  
  console.log(digitCount);