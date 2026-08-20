class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length == 0 || arr == null)
            return result;
        result.add(arr[0]);
        for(int i = 1;i < arr.length;i++){
            if(arr[i] != arr[i - 1])
                result.add(arr[i]);
        }
        return result;
    }
}
