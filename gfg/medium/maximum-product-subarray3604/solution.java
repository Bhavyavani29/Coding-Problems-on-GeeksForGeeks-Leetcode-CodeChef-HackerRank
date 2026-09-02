class Solution {
    int maxProduct(int[] arr) {
        // code here
        int CurrMax = arr[0];
        int CurrMin = arr[0];
        int Max = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(arr[i] < 0){
                int temp = CurrMax;
                CurrMax = CurrMin;
                CurrMin = temp;
            }
            CurrMax = Math.max(arr[i], CurrMax * arr[i]);
            CurrMin = Math.min(arr[i], CurrMin * arr[i]);
            Max = Math.max(Max, CurrMax);
        }
        return Max;
    }
}