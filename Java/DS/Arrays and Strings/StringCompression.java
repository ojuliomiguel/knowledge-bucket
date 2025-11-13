import static java.lang.IO.println;

void main() {
    println(compression("aabcccccaaa"));
}

String compression(String str) {
    char[] strChars = str.toCharArray();
    Arrays.sort(strChars);
    Map<Character, Integer> strCharsFrequenceMap = new HashMap<Character, Integer>();

    for (int i = 0; i < str.length(); i++) {
        strCharsFrequenceMap.merge(strChars[i], 1, Integer::sum);
    }

    StringBuilder compressionStrBuilder = new StringBuilder();
    strCharsFrequenceMap.forEach((ch, count) -> {
        compressionStrBuilder.append(ch.toString());
        compressionStrBuilder.append(count.toString());
    });

    return compressionStrBuilder.toString();
}