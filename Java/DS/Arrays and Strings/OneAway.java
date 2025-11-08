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