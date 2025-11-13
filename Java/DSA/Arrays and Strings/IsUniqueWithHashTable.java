import static java.lang.IO.println;

void main() {
    println(isUnique("abcdefghi"));
}

boolean isUnique(String str) {
    Set<Character> seen = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
        char character = str.charAt(i);
        if (!seen.add(character)) {
            return false;
        }
    }
    return true;
}