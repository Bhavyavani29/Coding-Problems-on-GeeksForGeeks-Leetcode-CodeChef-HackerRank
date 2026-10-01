// Solution

function maxCustomers(x, y){
    console.log(x * y);
}

// Input related code. Please do not change this.
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.split(' ');
  const x = parseInt(nums[0]);
  const y = parseInt(nums[1]);
  maxCustomers(x, y);
});
