import static java.lang.IO.println;

void main() {
    println(replaceSpaces("Julio Miguel     ".toCharArray(), 12));
}

String replaceSpaces(char[] str, int trueLength) {
    final int CHARS_QTY = 3;
    int spaceCount = 0, index;
    for (int i = 0; i < trueLength; i++) {
        if (str[i] == ' ') {
            spaceCount++;
        }
    }
    index = trueLength + spaceCount *2;
    if (trueLength < str.length) {
        str[trueLength] = '\0';
    }
    for (int i = trueLength -1; i >= 0; i--) {
        if (str[i] == ' ') {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index -= CHARS_QTY;
        } else {
            str[index - 1] = str[i];
            index--;
        }
    }
    return new String(str);
}


