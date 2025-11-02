import static java.lang.IO.println;

void main () {
    println(isPermutable("aab", "aba"));
    println(isPermutable("abb", "aba"));
    println(isPermutable("bba", "abb"));
}

boolean isPermutable(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) {
        return false;
    }

    return sort(strOne).equals(sort(strTwo));
}

String sort(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}