class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here 
        int totalSum = 0, discountSum = 0;
        for(int i = 0;i < n;i++){
            totalSum += prices[i];
            if(prices[i] >= y){
                discountSum += prices[i] - y;
            }
            else{
                discountSum += 0;
            }
        }
        int result = x + discountSum;
        if(result < totalSum){
            return "COUPON";
        }
        return "NO COUPON";
    }
}
