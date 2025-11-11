import static java.lang.IO.println;

void main() {
    println(isOneAway("pale", "ple"));
    println(isOneAway("pale", "paa"));
    println(isOneAway("pales", "pale"));
    println(isOneAway("pale", "bale"));
    println(isOneAway("pale", "bake")); // false
}

boolean isOneAway(String strOne, String strTwo) {
    if (strOne.equals(strTwo)) {
        return true;
    }
    HashMap<Character, Integer> charMap = new HashMap<>();

    for (int i = 0; i < strOne.length(); i++) {
        charMap.put(strOne.charAt(i), i);
    }

    for (int i = 0; i < strTwo.length(); i++) {
        if (!charMap.containsKey(strTwo.charAt(i))) {
            Integer idx = charMap.get(strTwo.charAt(i));

        }

    }
}

boolean oneEditInsert(String strOne, String strTwo) {
    int idx1 = 0;
    int idx2 = 0;

    while (idx2 < strTwo.length() && idx1 < strOne.length()) {
        if (strOne.charAt(idx1) != strTwo.charAt(idx2)) {
            if (idx1 != idx2) {
                return false;
            }
            idx2++;
        } else {
            idx1++;
            idx2++;
        }
    }
    return true;
}