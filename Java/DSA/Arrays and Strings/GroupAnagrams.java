import static java.lang.IO.print;

import java.util.ArrayList;

void main() {
    String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
    groupAnagrams(strs);
}

List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    Arrays.stream(strs)
            .forEach(str -> {
                char[] charStr = str.toCharArray();
                Arrays.sort(charStr);
                String key = new String(charStr);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }

                map.get(key).add(str);
            });
    return new ArrayList<>(map.values());
}