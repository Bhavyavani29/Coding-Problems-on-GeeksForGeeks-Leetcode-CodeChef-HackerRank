// Solution

function addTwoNumbers(tests){
  let t = parseInt(tests[0]);
  for(let i = 1; i <= t; i++){
    const nums = tests[i].split(' ');
    let a = parseInt(nums[0]);
    let b = parseInt(nums[1]);
    console.log(a + b);
  }
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const tests = input.split('\n');
  addTwoNumbers(tests);
});
