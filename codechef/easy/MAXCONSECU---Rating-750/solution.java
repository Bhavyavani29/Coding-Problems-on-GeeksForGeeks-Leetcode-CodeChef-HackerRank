    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int currStreak = 0, maxStreak = 0;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] == 1){
               currStreak++;
               maxStreak = Math.max(currStreak, maxStreak);
           }
           else{
               currStreak = 0;
           }
       }
       return maxStreak;
    }
