import static java.lang.IO.println;

void main() {
    println(isAPalindromePermutation(""));
    println(isAPalindromePermutation("Tact Coa"));      // true  → "tacocat"
    println(isAPalindromePermutation("carrace"));       // true  → "racecar"
    println(isAPalindromePermutation("racecar"));       // true
    println(isAPalindromePermutation("tacocat"));       // true
    println(isAPalindromePermutation("ab! ba"));        // true
    println(isAPalindromePermutation("No 'x' in Nixon"));// true
    println(isAPalindromePermutation("madam"));         // true
    println(isAPalindromePermutation("redder"));        // true
    println(isAPalindromePermutation("abc")); // false
}

boolean isAPalindromePermutation(String str) {
    Set<Integer> odds = new HashSet<>();
    str.codePoints()
            .map(Character::toLowerCase)
            .filter(Character::isLetter)
            .forEach(cp -> {
               if (!odds.add(cp)) {
                   odds.remove(cp);
               }
            });
    return odds.size() <= 1;
}