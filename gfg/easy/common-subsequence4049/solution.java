class Solution {
    public boolean commonSubseq(String s1, String s2) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s1.toCharArray()){
            hs.add(ch);
        }
        for(char ch : s2.toCharArray()){
            if(hs.contains(ch)){
                return true;
            }
        }
        return false;
    }
}