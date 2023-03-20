import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            StringBuilder sb = new StringBuilder();
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            for (char ch : temp)
                sb.append(ch);
            var x = map.getOrDefault(sb.toString(), new ArrayList<String>());
            x.add(s);
            map.put(sb.toString(), x);
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        map.forEach((key, value) -> {
            ans.add(value);
        });
        return ans;

    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        ArrayList<ArrayList<String>> result = groupAnagrams(strs);
        for (var r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}