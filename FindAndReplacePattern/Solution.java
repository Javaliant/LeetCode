import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        System.out.println(findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        String matcher = tokenize(pattern);
        for (String word : words) {
            if (tokenize(word).equals(matcher)) {
                result.add(word);
            }
        }
        return result;
    }

    private static String tokenize(String input) {
        char token = 'a';
        StringBuilder result = new StringBuilder();
        Map<Character, Character> tokenSet = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!tokenSet.containsKey(c)) {
                tokenSet.put(c, token++);
            }
            result.append(tokenSet.get(c));
        }
        return result.toString();
    }
}