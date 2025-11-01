import static java.lang.IO.println;

void main() {
    println(isPermutable("abb", "aba"));
}

boolean isPermutable(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) {
        return false;
    }

    Map<Character, Integer> integerCharacterHashMap = new HashMap<Character, Integer>();

    char[] charStrOne = strOne.toCharArray();
    char[] charStrTwo = strTwo.toCharArray();



    return true;
}
