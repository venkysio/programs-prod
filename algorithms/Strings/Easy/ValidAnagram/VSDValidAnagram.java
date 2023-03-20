import java.util.HashMap;

public class Main {

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s.toCharArray())
            charCount.put(ch, 1 + charCount.getOrDefault(ch, 0));
        for (char ch : t.toCharArray()) {
            if (!charCount.containsKey(ch))
                return false;
            charCount.put(ch, charCount.get(ch) - 1);
        }
        for (var d : charCount.entrySet()) {
            if (d.getValue() != 0)
                return false;

        }
        return true;

    }

    public static void main(String[] args) {
        String s = "hello", t = "olleh";
        if (isAnagram(s, t))
            System.out.println("These are anagrams");
        else
            System.out.println("These are not anagrams");
    }
}