import static java.lang.IO.print;

import java.util.ArrayList;

void main() {
    String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
    gatherAnagrams(strs);
}

List<List<String>> gatherAnagrams(String[] anagrams) {
    var groupedAnagrams = new HashMap<String, List<String>>();
    Arrays.stream(anagrams)
        .forEach(anagram -> {
            char[] anagramChars = anagram.toCharArray();
            Arrays.sort(anagramChars);
            String key = new String(anagramChars);
            if (!groupedAnagrams.containsKey(key)) {
                groupedAnagrams.put(key, new ArrayList<>());
            }
            groupedAnagrams.get(key).add(anagram);
        });
    return new ArrayList<>(groupedAnagrams.values());
}