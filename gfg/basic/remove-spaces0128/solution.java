class Solution {
    public String removeSpaces(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        String str[] = s.split(" ");
        for(String S : str){
            sb.append(S);
        }
        return sb.toString();
    }
}