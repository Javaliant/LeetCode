# [Find and Replace Pattern](https://leetcode.com/problems/find-and-replace-pattern/description/)

**Challenge:** Given a list of words and a pattern, find which words match the pattern.

A word matches the pattern if there exists a permutation of letters p such that replacing every letter x in the pattern with p(x) gets the desired word.

**Output:** Return a list of words that match the given pattern.

**Specifications:**
* `1 <= words.length <= 50`
* `1 <= pattern.length = words[i].length <= 20`

**Example:**
```
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter
```