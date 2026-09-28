// Solution

function isErrorProne(x, y){
    if(x < y){
        console.log("YES");
    } else {
        console.log("NO");
    }
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const x = parseInt(nums[0]); 
  const y = parseInt(nums[1]); 
  isErrorProne(x, y);
});

