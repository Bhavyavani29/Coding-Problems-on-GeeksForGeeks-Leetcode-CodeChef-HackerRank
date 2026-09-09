class Solution {
    public int multiply(int[] arr) {
        // code here
        int n = arr.length;
        int lsum = 0, rsum = 0, result = 0;
        int mid = n / 2;
        for(int i = 0; i < mid;i++){
            lsum += arr[i];
        }
        for(int i = mid; i < n;i++){
            rsum += arr[i];
        }
        result = lsum * rsum;
        return result;
    }
}
