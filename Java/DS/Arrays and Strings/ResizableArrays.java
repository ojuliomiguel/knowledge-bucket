import static java.lang.println;

void main() {
    String[] words = {"apple", "banana", "cherry"};
    String[] more = {"date", "elderberry"};

    ArrayList<String> setence = new ArrayList<String>();

    for (String w: words) setence.add(w);
    for (String m: more) setence.add(m);

    println(setence);
}

