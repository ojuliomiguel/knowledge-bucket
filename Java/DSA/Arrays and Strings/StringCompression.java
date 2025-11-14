import static java.lang.IO.println;

void main() {
    println(compression("aabcccccaaa"));
    println(compression("abcccccaaa"));
}

String compression(String str) {
    StringBuilder compressed = new StringBuilder();
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
        countConsecutive++;
        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressed.append(str.charAt(i));
            compressed.append(countConsecutive);
            countConsecutive = 0;
        }
    }
    return compressed.length() < str.length() ? compressed.toString() : str;
}