// Solution

function solve(n, a, b){
    console.log(n - a, n - a - b);
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const n = parseInt(nums[0]); 
  const a = parseInt(nums[1]); 
  const b = parseInt(nums[2]); 
  solve(n, a, b);
});