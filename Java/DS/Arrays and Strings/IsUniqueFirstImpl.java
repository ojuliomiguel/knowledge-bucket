import static java.lang.IO.println;

void main() {
    String stringToVerifyUniqueness = "abgcdefgh";
    println(isUnique(stringToVerifyUniqueness) == isUniqueWithoutDS(stringToVerifyUniqueness));
}

boolean isUnique(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
        char characterToVerify = str.charAt(i);
        for (char c : chars) {
            boolean isSameCharacter = characterToVerify == c && str.indexOf(characterToVerify) != str.lastIndexOf(characterToVerify);
            if (isSameCharacter) {
                return false;
            }
        }
    }
    return true;
}

boolean isUniqueWithoutDS(String str) {
    for (int i = 0; i < str.length(); i++) {
        char characterToVerify = str.charAt(i);
        for (int j = i + 1; j < str.length(); j++) {
            if (characterToVerify == str.charAt(j)) {
                return false;
            }
        }

    }
    return true;
}