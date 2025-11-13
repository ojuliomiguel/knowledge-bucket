import static java.lang.IO.println;

void main() {
    println(isPermutable("aab", "aba"));
}

boolean isPermutable(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) {
        return false;
    }

    char[] charactersStrOne = strOne.toCharArray();
    Arrays.sort(charactersStrOne);
    char[] charactersStrTwo = strTwo.toCharArray();
    Arrays.sort(charactersStrTwo);

    for (int i = 0; i < charactersStrOne.length; i++) {
        if (charactersStrOne[i] != charactersStrTwo[i]) {
            return false;
        }
    }

    return true;
}