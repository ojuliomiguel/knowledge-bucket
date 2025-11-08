import static java.lang.IO.println;

void main() {
    println(isOneAway("pale", "ple"));
    println(isOneAway("pales", "pale"));
    println(isOneAway("pale", "bale"));
    println(isOneAway("pale", "bake"));
}

boolean isOneAway(String strOne, String strTwo) {
    int counter = 0;
    if (strOne.equals(strTwo)) {
        return true;
    }
    if (strOne.length() == strTwo.length() ) {
        for (int i = 0; i < strTwo.length(); i++) {
            if (strOne.charAt(i) != strTwo.charAt(i)) {
                counter++;
            }
        }

    }
    return counter <= 1;
}