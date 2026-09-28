// Solution

function totalBlackCells(n){
    console.log(n * n / 2);
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (input) {
   let n = parseInt(input); 
   totalBlackCells(n);
});

