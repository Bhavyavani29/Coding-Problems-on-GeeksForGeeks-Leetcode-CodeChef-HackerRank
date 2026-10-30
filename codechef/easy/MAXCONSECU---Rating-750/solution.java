    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int currStreak = 0, minStreak = 0;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] == 1){
               currStreak++;
               minStreak = Math.max(currStreak, minStreak);
           }
           else{
               currStreak = 0;
           }
       }
       return minStreak;
    }
