// Solution

function isGoodTurn(tests){
   let t = parseInt(tests[0]);
   for(let i = 1; i <= t; i++){
       const nums = tests[i].split(' '); // nums array stores A and B
       let a = parseInt(nums[0]);
       let b = parseInt(nums[1]);
       if(a + b > 6) {
          console.log("YES");
       } else {
          console.log("NO");
       }
   }
   
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const tests = input.split('\n');
  isGoodTurn(tests);
});