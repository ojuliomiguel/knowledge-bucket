import static java.lang.IO.println;

void main(){

}

boolean isUnique(char[] characters) {
    Arrays.sort(characters);

    for (int i = 1; i < characters.length; i++) {
        if (characters[i] == characters[i-1]) {
            return false;
        }
    }
    return true;
}