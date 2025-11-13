import static java.lang.IO.println;

void main() {
    println(isPermutable("aab", "aba"));
    println(isPermutable("abb", "aba"));
    println(isPermutable("bba", "abb"));
}

boolean isPermutable(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) {
        return false;
    }

    Map<Character, Integer> charsFrequenceMap = new HashMap<Character, Integer>();

    for (int i = 0; i < strOne.length(); i++) {
        charsFrequenceMap.merge(strOne.charAt(i), 1, Integer::sum);
    }

    for (int i = 0; i < strTwo.length(); i++) {
        Integer frequency = charsFrequenceMap.get(strTwo.charAt(i));
        if (frequency == null || frequency == 0) {
            return false;
        }
        if (frequency == 1) {
            charsFrequenceMap.remove(strTwo.charAt(i));
        } else {
            charsFrequenceMap.put(strTwo.charAt(i), frequency - 1);
        }
    }

    return true;
}
