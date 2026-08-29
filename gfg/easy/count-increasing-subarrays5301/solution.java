class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int j = 0, count = 0, prev = arr[0];
        for(int i=1; i<arr.length; i++){
            j=i;
            while(j<arr.length&&prev<arr[j]){
                count++;
                prev = arr[j];
                j++;
            }
            prev = arr[i];
        }
        return count;
    }
}
