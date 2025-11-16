import static java.lang.IO.println;

void main() {
    println(compression("aabcccccaaa"));
    println(compression("abcccccaaa"));
}

String compression(String str) {
    if (str == null || str.isEmpty()) return str;
    Pattern pattern = Pattern.compile("(.)\\1*");
    Matcher matcher = pattern.matcher(str);
    String compressed = matcher.results()
            .map(MatchResult::group)
            .map(group -> group.charAt(0) + String.valueOf(group.length()))
            .collect(Collectors.joining());
    return compressed.length() < str.length() ? compressed : str;
}