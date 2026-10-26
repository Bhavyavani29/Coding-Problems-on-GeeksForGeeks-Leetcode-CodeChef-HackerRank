class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        if(nums.length == 0)
            return 0;
        int min = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int minCount = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == min){
                minCount++;
            }
        }
        return nums.length - minCount;
    }
}
