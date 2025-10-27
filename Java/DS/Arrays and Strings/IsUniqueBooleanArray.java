import static java.lang.IO.println;


void main() {
    
} 

boolean isUnique(String str) {
    boolean[] seen = new boolean[128];

    for (int i = 0; i < str.length(); i++) {
        if (seen[i]) {
            return false;
        }
        seen[i] = true;
    }
    return true;
}
