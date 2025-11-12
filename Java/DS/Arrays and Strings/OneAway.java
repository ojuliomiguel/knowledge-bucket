import static java.lang.IO.println;

void main() {
    println(isOneAway("pale", "ple"));
    println(isOneAway("pale", "paa"));
    println(isOneAway("pales", "pale"));
    println(isOneAway("pale", "bale"));
    println(isOneAway("pale", "bake")); // false
}

boolean isOneAway(String strOne, String strTwo) {
    if (strOne.length() == strTwo.length()) {
        return oneEditReplace(strOne, strTwo);
    } else if (strOne.length() + 1 == strTwo.length()) {
        return oneEditInsert(strOne, strTwo);
    } else if (strOne.length() - 1 == strTwo.length()) {
        return oneEditInsert(strTwo, strTwo);
    }
    return false;
}

boolean oneEditReplace(String strOne, String strTwo) {
    boolean foundDiff = false;
    for (int i = 0; i < strOne.length(); i++) {
        if (strOne.charAt(i) != strTwo.charAt(i)) {
            if (foundDiff) {
                return false;
            }
            foundDiff = true;
        }
    }
    return true;
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