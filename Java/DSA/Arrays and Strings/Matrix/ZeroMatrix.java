import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
    int[][] matrix = {
            {1, 2, 1},
            {4, 5, 6},
            {7, 8, 0}
    };
    println(containsZero(matrix));
}

int[][] zeroMatrix(int[][] matrix) {
    return matrix;
}

boolean containsZero(int[][] matrix) {
    for (int i = 0; i< matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) {
                return true;
            }
        }
    }
    return false;
}