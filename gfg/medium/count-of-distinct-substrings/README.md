# Count Distinct Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**  consisting of lowercase English letters, find the total number of distinct non-empty  **substrings**  of s.

 **Note:** A substring is a contiguous sequence of characters within a string. Two substrings are considered distinct if they have different character sequences, regardless of their positions in the string.

 **Examples :** 

```
Input: s = "ababa"
Output: 9
Explanation: All distinct substrings of "ababa" are: "a", "b", "ab", "ba", "aba", "bab", "abab", "baba", "ababa".

```

```
Input: s = "aaa"
Output: 3
Explanation: The distinct substrings of "aaa" are: "a", "aa", "aaa".
```

 **Constraints:** 
1 ≤ s.size() ≤ 3000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T17:03:20.893Z  

```java
class Solution {
    static class State {
        int len, link;
        Map<Character, Integer> next = new HashMap<>();
    }

    public static int countSubs(String s) {
        List<State> st = new ArrayList<>();
        st.add(new State()); // initial state
        st.get(0).len = 0;
        st.get(0).link = -1;

        int last = 0;

        for (char c : s.toCharArray()) {
            int cur = st.size();
            st.add(new State());
            st.get(cur).len = st.get(last).len + 1;

            int p = last;
            while (p != -1 && !st.get(p).next.containsKey(c)) {
                st.get(p).next.put(c, cur);
                p = st.get(p).link;
            }

            if (p == -1) {
                st.get(cur).link = 0;
            } else {
                int q = st.get(p).next.get(c);
                if (st.get(p).len + 1 == st.get(q).len) {
                    st.get(cur).link = q;
                } else {
                    int clone = st.size();
                    st.add(new State());
                    st.get(clone).len = st.get(p).len + 1;
                    st.get(clone).next.putAll(st.get(q).next);
                    st.get(clone).link = st.get(q).link;

                    while (p != -1 && st.get(p).next.get(c) == q) {
                        st.get(p).next.put(c, clone);
                        p = st.get(p).link;
                    }

                    st.get(q).link = clone;
                    st.get(cur).link = clone;
                }
            }
            last = cur;
        }

        long ans = 0;
        for (int i = 1; i < st.size(); i++) {
            ans += st.get(i).len - st.get(st.get(i).link).len;
        }
        return (int) ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-distinct-substrings/1)