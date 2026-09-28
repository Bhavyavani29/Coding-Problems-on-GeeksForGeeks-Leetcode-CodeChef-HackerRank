// Solution

function isAliceHappy(x, y){
    if(x >= 2 * y){
        console.log("Yes");
    } else{
        console.log("No");
    }
}

// Input related code. Please do not change this.
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const x = parseInt(nums[0]); 
  const y = parseInt(nums[1]); 
  isAliceHappy(x, y);
});
