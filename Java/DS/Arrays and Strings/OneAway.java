import static java.lang.IO.println;

void main() {
    println(isOneAway("pale", "ple"));
    println(isOneAway("pales", "pale"));
    println(isOneAway("pale", "bale"));
    println(isOneAway("pale", "bake"));
}

boolean isOneAway(String strOne, String strTwo) {
    boolean isOneAwayEdited = false;
    if (strOne.equals(strTwo)) {
        return true;
    }
    if (strOne.length()  - strTwo.length() <= 1 ) {
        for (int i = 0; i < strTwo.length(); i++) {
            if (strOne.charAt(i) != strTwo.charAt(i)) {
                isOneAwayEdited = true;
            } else {
                isOneAwayEdited = false;
            }
        }

    }
    return isOneAwayEdited;
}