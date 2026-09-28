// Solution

function abDifference(a, b){
    let sum = a + b;
    let product = a * b;
    if(product > sum){
        console.log(product - sum);
    } else{
        console.log(sum - product);
    }
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const a = parseInt(nums[0]); 
  const b = parseInt(nums[1]); 
  abDifference(a, b);
});

