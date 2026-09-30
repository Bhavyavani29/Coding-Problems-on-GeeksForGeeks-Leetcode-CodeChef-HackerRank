    let N = parseInt(inputChar);
    let y = 1;
    let result = [];

    while (y <= N) {
        // For each value of y, calculate its square (y * y) and append it to the result array.
        result.push(y * y);
        y++;
    }
   
    //result.join(' ') to convert the array of squares into a space-separated string.
    console.log(result.join(' '));