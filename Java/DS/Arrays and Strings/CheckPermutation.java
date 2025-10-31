import static java.lang.IO.println;

void main() {
    println(isPermutable("foo", "oof"));
}

boolean isPermutable(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) {
        return false;
    }

    char[] charactersStrOne = strOne.toCharArray();
    char[] charactersStrTwo = strOne.toCharArray();

    Set<Character> contains = new HashSet<>();
    for (char c: charactersStrOne) {
        contains.add(c);
    }

    for (char c: charactersStrTwo) {
        if(contains.add(c)) {
            return false;
        }
    }

    return true;
}