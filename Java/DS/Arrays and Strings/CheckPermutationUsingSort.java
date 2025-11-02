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

    char[] charsStrOne = strOne.toCharArray();
    Arrays.sort(charsStrOne);
    String sortedStrOne = new String(charsStrOne);

    char[] charsStrTwo = strTwo.toCharArray();
    Arrays.sort(charsStrTwo);
    String sortedStrTwo = new String(charsStrTwo);

    return sortedStrOne.equals(sortedStrTwo);
}